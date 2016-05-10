/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import sun.util.calendar.CalendarUtils;

/**
 *
 * @author Himel
 */
public class AccountSystem {

    /**
     * @param args the command line arguments
     */
    class Account 
    {
        int accountNumber;
        String holderName;
        String holderType;
        Account(int a,String b,String c) 
        {
            accountNumber=a;
            holderName=b;
            holderType=c;
        }
    }
    class BankAccount extends Account
    {
        String bankName;
        double balance;

        BankAccount(int a,String b,String c,double d) 
        {
            super(a,b,"Normal");
            bankName=c;
            balance=d;
        }
        
    }
    class StudentAccount extends Account
    {
        String institute;
        String status;
        StudentAccount(int a,String b,String c,String d) 
        {
            super(a,b,"Student");
            institute=c;
            status=d;
        }
    }
    class SavingstAccount extends BankAccount
    {
        double depositAmount;
        double withdrawalAmount;
        int passbookNo;

        public SavingstAccount(int a, String b, String c, double d) {
            super(a, b, c, d);
        }
        void deposit(int am)
        {
            depositAmount=am;
            balance-=am;
        }
        void withdraw(int am)
        {
            withdrawalAmount=am;
            balance+=am;
        }
    }
    class BasictAccount extends BankAccount
    {
        double checkAmount;
        int countChecks;
        int checkbookNo;

        public BasictAccount(int a, String b, String c, double d,int x) {
            super(a, b, c, d);
            checkbookNo=x;
        }
        void check(int id,double am)
        {


            checkAmount=am;
            countChecks++;
            balance--;
        }
    }
    class DepositAccount extends BankAccount
    {
        double depositAmount;
        int countChecks;

        public DepositAccount(int a, String b, String c, double d) {
            super(a, b, c, d);
        }
        void deposit(int am)
        {
            depositAmount=am;
            balance-=am;
            countChecks++;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
