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
    // �˵�
    private static void menu() {
        System.out.println("\033[1;94m\t" + "------------��ͥ��֧�������-----------");
        System.out.println("\t" + "            1����֧��ϸ");
        System.out.println("\t" + "            2���Ǽ�����");
        System.out.println("\t" + "            3���Ǽ�֧��");
        System.out.println("\t" + "            4����   ��");
        System.out.println();
        System.out.println("\t" + "            ��ѡ��(1-4):");

    }


    private static void opt() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
        menu();
        int optNum = sc.nextInt();
        switch (optNum) {
            // ��ӡ��֧��ϸ
            case 1 : {
                PaymentDetails();
                break;
            }
            // �Ǽ�����
            case 2 :{
                String s = RegistrationOfIncome();
//                income = s;
                incomes.add(s);
                break;}
            // �Ǽ�֧��
            case 3 : {
                String s = RegistrationOfSpend();
//                spend = s;
                spends.add(s);
                 break; }
            case 4 : {
                System.out.print("�Ƿ�ȷ���˳���(Y/N)" );
                String s = sc.next();
                if (s.equals("Y")) {
                    flag = false;
                    System.out.println("�������˳�");
                }
                    break;
            }
            default:
                System.out.println("������������������");
                break;
        }
        }
    }

    private static String RegistrationOfSpend() {
        Scanner sc = new Scanner(System.in);
        System.out.print("����֧�����:");
        int spendMoney = sc.nextInt();
        System.out.println();
        System.out.print("����֧��˵��:");
        String instruction = sc.next();
        return spendMoney + " " + instruction;

    }

    private static String RegistrationOfIncome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("����������:");
        int incomeMoney = sc.nextInt();
        System.out.println();
        System.out.print("��������˵��:");
        String instruction = sc.next();
        return incomeMoney + " " + instruction;
    }

    private static void PaymentDetails() {
        System.out.println("-----------��ǰ��֧��ϸ--------------");
        System.out.println("��֧\t" + "�˻����\t" + "��֧���\t" + "˵��\t");

//        if (income != null) {
//            System.out.print("����\t" + getIncomeMoney() + "\t");
//            System.out.print(  income.split(" ")[0] + "\t" + income.split(" ")[1]);
//            System.out.println();
//        }

        printInformation(incomes,"����",getIncomeMoney());

//        if (spend == null) return;
//        System.out.print("֧��\t" + getBalance() + "\t");
//
//            System.out.print(spend.split(" ")[0] + "\t" + spend.split(" ")[1]);
//            System.out.println();
//        System.out.println();
        printInformation(spends , "֧��" ,getBalance());
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
