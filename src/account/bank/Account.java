/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account.bank;

import java.time.LocalDate;

public class Account {
    private int accountNo;
    private String name;
    private float accountAmount;
    private LocalDate date;
    
    public int getID(){
        return accountNo;
    }
    public void insert(int a,String n,float acc){
        this.accountNo=a;
        this.name=n;
        this.accountAmount=acc;
        date=LocalDate.now();
        System.out.println("Account created at "+date);
    }
    public void deposit(float am){
        System.out.println("You Deposited "+am);
        this.accountAmount+=am;
    }
    public void withdraw(float am){
        if(this.accountAmount<am){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println(am+" Withdrawn");
            this.accountAmount-=am;
        }
    }
    public void checkBalance(){
        System.out.println("Balance is : "+this.accountAmount);
    }
    
    public void display(){
        System.out.println(this.accountNo+"  "+this.name+"  "+this.accountAmount);
    }
}
