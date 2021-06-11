package FamilyAccount;

public class FamilyAccount {
    public static void main(String[] args) {

        boolean isFlag = true;

        //用于记录用户的收入与支出的详情
        String details = "收支 \t账户金额 \t收支金额 \t说   明\n";
        //初始金额
        int balance = 10000;

        while(isFlag){

            System.out.println("---------------家庭收支记账软件------------\n");
            System.out.println("                  1.收支明细");
            System.out.println("                  2.登记收入");
            System.out.println("                  3.登记支出 ");
            System.out.println("                  4.退    出\n ");
            System.out.print("                     请选择（1-4）：");

            //获取用户的选择： 1-4
            char selection = Utility.readMenuSelection();


            switch (selection){

                case '1':
                    //System.out.println("1.收支明细");
                    System.out.println("-----------------当前收支明细记录---------");
                    System.out.println(details);
                    System.out.println("------------------------------------------");
                    break;
                case '2': {
                    //System.out.println("2.登记收入");
                    System.out.println("本次收入金额");
                    int money = Utility.readNumber();
                    System.out.println("本次收入说明:");
                    String info = Utility.readString();

                    //处理balance
                    balance += money;

                    //处理details
                    details += ("收入\t" + balance + "\t\t" + money + "\t\t\t" + info + "\n");

                    System.out.println("--------------------登记完成---------------");
                }
                    break;
                case '3': {
                    //System.out.println("3.登记支出");
                    System.out.println("本次支出金额");
                    int money = Utility.readNumber();
                    System.out.println("本次支出说明:");
                    String info = Utility.readString();


                    //处理balance
                    if(balance >= money){
                        balance -= money;

                        //处理details
                        details += ("支出\t" + balance + "\t\t" + money + "\t\t\t" + info + "\n");
                    }else{
                        System.out.println("余额不足，支付失败");
                    }
                    System.out.println("--------------------登记完成---------------");
                }
                    break;
                case '4':
//                    System.out.println("4.退   出");
//                    break;
                    System.out.println("确认是否退出(Y/N)：");
                    char  isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
            }

        }
    }

}
