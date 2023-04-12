package org.example;

import java.util.UUID;

public class SBI implements  BankInterface1{

    private  int balance;
    private String accountNo;

    private  String password;
    private String name;
    public   static double rateOfInterest;

    public SBI(int balance,String  password,String name){
        accountNo= UUID.randomUUID().toString();
        this.balance=balance;
        this.password=password;
        this.name=name;
    }
    @Override
    public int checkBalance(String password) {

        if(password.equals(this.password)){
            return  this.balance;
        }
        return -1;
    }

    @Override
    public String getAccountNumber(String password) {
        if(password.equals(this.password)){
            return accountNo;
        }
        return null;
    }

    @Override
    public String addMoney(int balance) {

        if(balance>=1){
            this.balance+=balance;
            return balance+"Rs is successfully Credited";
        }
        return "At least add Rs. 1";
    }

    @Override
    public String withdrawMoney(int money, String password) {

        if(password.equals(this.password)){

            if(money<=this.balance){
                balance-=money;
                return money+"Rs is Debited";
            }else{
                return "not sufficient balance";
            }
        }
        return "Invalid Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {

        if(oldPassword.equals(this.password)){
            this.password=newPassword;
            return "Password updated successfully";
        }
        return "Invalid Password";
    }

    @Override
    public double calculateTotalInterest(int years, String password) {

        if(password.equals(this.password)){

            return  (this.balance*rateOfInterest*years)/100;
        }
        return  0;
    }
}
