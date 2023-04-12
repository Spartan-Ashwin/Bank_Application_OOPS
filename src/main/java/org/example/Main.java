package org.example;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        SBI.rateOfInterest=7;
        HDFC.rateOfInterest=8;




        SBI saccount1=new SBI(100000,"abc","Ashwin Shelke");

        SBI saccount2=new SBI(200000,"xyz","Deepak Shelke");

        HDFC haccount1=new HDFC(30000,"pqr","Digambar Shelke");

        int balance=saccount1.checkBalance("abc");
        System.out.println((balance));
        System.out.println(saccount1.getAccountNumber("abc"));
        saccount1.addMoney(500);
        System.out.println(saccount1.checkBalance("abc"));
        System.out.println(saccount1.withdrawMoney(123,"abc"));
        System.out.println(saccount1.checkBalance("abc"));


    }
}