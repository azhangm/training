package day01.Proj;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseholdLedger {
    private static int totalMoney = 10000;
    private static ArrayList<String> incomes = new ArrayList<>();
    public static ArrayList<String> spends = new ArrayList<>();
//    private static int incomeMoney;
//    private static int spendMoney;
//    private static String income ;
//    private static String spend;
    public static void main(String[] args) {
        opt();
    }
    // 菜单
    private static void menu() {
        System.out.println("\033[1;94m\t" + "------------家庭收支记账软件-----------");
        System.out.println("\t" + "            1、收支明细");
        System.out.println("\t" + "            2、登记收入");
        System.out.println("\t" + "            3、登记支出");
        System.out.println("\t" + "            4、退   出");
        System.out.println();
        System.out.println("\t" + "            请选择(1-4):");

    }


    private static void opt() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
        menu();
        int optNum = sc.nextInt();
        switch (optNum) {
            // 打印收支明细
            case 1 : {
                PaymentDetails();
                break;
            }
            // 登记收入
            case 2 :{
                String s = RegistrationOfIncome();
//                income = s;
                incomes.add(s);
                break;}
            // 登记支出
            case 3 : {
                String s = RegistrationOfSpend();
//                spend = s;
                spends.add(s);
                 break; }
            case 4 : {
                System.out.print("是否确认退出？(Y/N)" );
                String s = sc.next();
                if (s.equals("Y")) {
                    flag = false;
                    System.out.println("程序已退出");
                }
                    break;
            }
            default:
                System.out.println("输入有误，请重新输入");
                break;
        }
        }
    }

    private static String RegistrationOfSpend() {
        Scanner sc = new Scanner(System.in);
        System.out.print("本次支出金额:");
        int spendMoney = sc.nextInt();
        System.out.println();
        System.out.print("本次支出说明:");
        String instruction = sc.next();
        return spendMoney + " " + instruction;

    }

    private static String RegistrationOfIncome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("本次收入金额:");
        int incomeMoney = sc.nextInt();
        System.out.println();
        System.out.print("本次收入说明:");
        String instruction = sc.next();
        return incomeMoney + " " + instruction;
    }

    private static void PaymentDetails() {
        System.out.println("-----------当前收支明细--------------");
        System.out.println("收支\t" + "账户金额\t" + "收支金额\t" + "说明\t");

//        if (income != null) {
//            System.out.print("收入\t" + getIncomeMoney() + "\t");
//            System.out.print(  income.split(" ")[0] + "\t" + income.split(" ")[1]);
//            System.out.println();
//        }

        printInformation(incomes,"收入",getIncomeMoney());

//        if (spend == null) return;
//        System.out.print("支出\t" + getBalance() + "\t");
//
//            System.out.print(spend.split(" ")[0] + "\t" + spend.split(" ")[1]);
//            System.out.println();
//        System.out.println();
        printInformation(spends , "支出" ,getBalance());
    }

    private static void printInformation(ArrayList<String> arrayList , String inf , int money) {
        if ( !arrayList.isEmpty()) {
            for (String s: arrayList) {
                System.out.print(inf + "\t" + money + "\t");
                if (incomes.indexOf(s) == 0)
                    System.out.println(s.split(" ")[0] + "\t\t" + s.split(" ")[1] + "\t" );
                else {
                    System.out.println("\t" +  "\t\t\t" + s.split(" ")[0] + "\t" + s.split(" ")[1] + "\t");
                }
            }
            System.out.println();
        }
    }

    private static int getIncomeMoney() {
//        return totalMoney + Integer.parseInt(income.split(" ")[0]);
        for (String s : incomes) {
            totalMoney += Integer.parseInt(s.split(" ")[0]);
        }
        return  totalMoney;
    }

    private static int getBalance() {
//       return totalMoney - Integer.parseInt(spend.split("")[0]);
        for (String s : spends) {
            totalMoney -= Integer.parseInt(s.split(" ")[0]);
        }
        return totalMoney;
//        return  0;
    }

}
