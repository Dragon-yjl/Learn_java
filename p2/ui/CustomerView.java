package p2.ui;


import com.sun.org.apache.xerces.internal.impl.xs.models.CMBuilder;
import com.sun.org.glassfish.external.statistics.impl.StatisticImpl;
import p2.bean.Customer;
import p2.service.CustomerList;
import p2.util.CMUtility;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);


    public CustomerView(){
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
        System.out.println("修改客户的操作");



    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer(){

        System.out.println("删除客户的操作");
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
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[] custs = customerList.getAllCustomer();
            for (int i = 0; i < custs.length ; i++) {
                Customer cust = custs[i];
                System.out.println((i+1)+"\t\t"+cust.getName()+
                        "\t"+cust.getGender()+"\t\t"+cust.getAge() +
                        "\t\t"+cust.getPhone()+"\t"+cust.getEmail());

            }
        }

        System.out.println("*************************客户列表完成***************************");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
