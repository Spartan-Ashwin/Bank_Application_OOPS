package org.example;

public interface BankInterface1 {



        public int checkBalance(String password);

        public  String getAccountNumber(String password);

        public String addMoney(int balance);

        public String withdrawMoney(int money, String password);

        public  String changePassword(String oldPassword,String newPassword);

        public  double calculateTotalInterest(int years,String password);
    }

