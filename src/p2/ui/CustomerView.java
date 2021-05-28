package p2.ui;


import com.sun.org.apache.xerces.internal.impl.xs.models.CMBuilder;
import com.sun.org.glassfish.external.statistics.impl.StatisticImpl;
import jdk.internal.cmm.SystemResourcePressureImpl;
import p2.bean.Customer;
import p2.service.CustomerList;
import p2.util.CMUtility;
import sun.util.resources.cldr.mua.CalendarData_mua_CM;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);


    public CustomerView(){//添加一个默认显示一个客户的构造器
        Customer customer = new Customer("顾陌",'男',23,"1234567890","gm@gmail.com");
        customerList.addCustomer(customer);
    }


    /**
     * 显示《客户信息管理软件》界面的方法
     */
    public void enterMainMenu(){

        boolean isFlag = true;
        while(isFlag) {
            System.out.println("\n*****************************客户信息管理软件****************************");
            System.out.println("                               1.添加客户");
            System.out.println("                                2.修改客户");
            System.out.println("                              3.删除客户");
            System.out.println("                               4.客户列表");
            System.out.println("                               5.退    出");
            System.out.println("                            请选择（1-5）：");

            char menu = CMUtility.readMenuSelection();
            switch(menu){
                case '1':
                addNewCustomer();
                break;

                case '2':
                    modifyCustomer();
                    break;

                case '3':
                    deleteCustomer();
                    break;

                case '4':
                    listAllCustomer();
                    break;

                case '5':
                //    System.out.println("退出");
                    System.out.println("确认是否退出(Y/N):");
                    char  isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
            }


        }


    }

    /**
     * 添加客户的操作
      */
    private void addNewCustomer() {
        //System.out.println("添加客户的操作");

        System.out.println("*****************************添加客户****************************");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        char gener = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱：");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name, gener, age, phone, email);

        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("*************************************添加完成****************************");

        } else {
            System.out.println("*********************************客户目录已满，添加失败********************");

        }
    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer(){
       // System.out.println("修改客户的操作");

        System.out.println("***************************修改客户********************************");

        Customer cust;
        int number;

        for(;;) {
            System.out.println("请选择修改客户的编号（-1退出）：");
            number = CMUtility.readInt();

            if(number == -1){//数组从0开始，但是客户信息编号从1开始，所以要-1
                return;
            }

             cust = customerList.getCustomer(number -1);
            if(cust == null){
                System.out.println("无法找到指定客户！");
            }else{//找到了相应编号的客户
                break;
            }
        }

        //执行完break到这，修改客户信息
        System.out.println("姓名(" + cust.getName() + "):" );
        String name = CMUtility.readString(10,cust.getName());
        System.out.println("性别(" + cust.getName() + "):" );
        char gender = CMUtility.readChar(cust.getGender());
        System.out.println("年龄(" + cust.getName() + "):" );
        int age = CMUtility.readInt(cust.getAge());
        System.out.println("电话(" + cust.getName() + "):" );
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.println("邮箱(" + cust.getName() + "):" );
        String email = CMUtility.readString(30,cust.getEmail());

        //把上述数据封装到对象中
        Customer newCust = new Customer(name,gender,age,phone,email);

        boolean isRepalaced = customerList.replaceCustomer(number-1,newCust);
        //修改的时候修改编号为1的客户信息实则修改数组下标为0的信息，所以number-1

        if(isRepalaced){
            System.out.println("***********************修改完成******************");
        }else{//实际上执行不到else这一句，要是输入错误会提示重新输入，所以不会修改失败
            System.out.println("***********************修改失败******************");
        }
    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer(){

        //System.out.println("删除客户的操作");

        System.out.println("************************删除客户**********************");

        int number;
        for(;;){
            System.out.println("请选择删除客户编号（-1退出）");
            number = CMUtility.readInt();

            if(number==1){
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if(customer == null){
                System.out.println("无法找到指定客户！");
            }else{//找到了指定的客户
                break;
            }
        }
        //执行完break语句到这，删除客户信息
        System.out.println("确认是否删除（Y/N）：");
        char isDelete = CMUtility.readConfirmSelection();
        if(isDelete == 'Y'){
            boolean deleteSuccess =customerList.deleteCustomer(number - 1);
            if(deleteSuccess){
                System.out.println("*********************删除成功*****************");
            }else{//与上面一样，没有机会执行
                System.out.println("*********************删除失败******************");
            }
        }else{
            return;//返回主界面
        }
    }

    /**
     * 显示客户列表的操作
     */
    private void listAllCustomer(){

        //System.out.println("显示客户列表的操作");
        System.out.println("************************客户列表****************************");

        int total = customerList.getTotal();
        if(total ==0){
            System.out.println("没有客户记录！");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t\t邮箱");
            Customer[] custs = customerList.getAllCustomer();
            for (int i = 0; i < custs.length ; i++) {//或者i < total
                Customer cust = custs[i];
                System.out.println((i+1)+"\t\t"+cust.getName()+
                        "\t"+cust.getGender()+"\t\t"+cust.getAge() +
                        "\t\t\t"+cust.getPhone()+"\t\t"+cust.getEmail());

            }
        }

        System.out.println("*************************客户列表完成***************************");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
