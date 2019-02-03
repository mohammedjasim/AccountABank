/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account.bank;

import java.util.HashMap;
import java.util.Scanner;


public class AccountBank {

    /**
     * @param args the command line arguments
     */
    static HashMap<Integer, Account> accounts;

    public static void main(String[] args) {
        accounts = new HashMap<>();
        Account a = createAccount(1, "name1", 100000);
        accounts.put(a.getID(), a);
        a = createAccount(2, "name2", 200000);
        accounts.put(a.getID(), a);
        a = createAccount(3, "name3", 300000);
        accounts.put(a.getID(), a);
        a = createAccount(4, "name4", 400000);
        accounts.put(a.getID(), a);
        a = createAccount(5, "name5", 500000);
        accounts.put(a.getID(), a);
        System.out.println("");
        System.out.println("");
        menu();
        System.out.println("");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int x = in.nextInt();
        int id;
        while (x != 0) {
            switch (x) {
                case 1:
                    System.out.print("Enter the ID : ");
                    id = in.nextInt();
                    if (search(id)) {
                        System.out.print("Enter the ammount to deposit : ");
                        accounts.get(id).deposit(in.nextFloat());

                    } else {
                        System.out.println("");
                        System.out.println("Account not Found !");
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("Enter the ID : ");
                    id = in.nextInt();
                    if (search(id)) {
                        System.out.print("Enter the ammount to withdraw : ");
                        accounts.get(id).withdraw(in.nextFloat());

                    } else {
                        System.out.println("");
                        System.out.println("Account not Found !");
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.print("Enter the ID : ");
                    id = in.nextInt();
                    if (search(id)) {
                        accounts.get(id).checkBalance();
                    } else {
                        System.out.println("");
                        System.out.println("Account not Found !");
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.print("Enter the ID : ");
                    id = in.nextInt();
                    if (search(id)) {
                        accounts.get(id).display();

                    } else {
                        System.out.println("");
                        System.out.println("Account not Found !");
                        System.out.println("");
                    }
                    break;
                    default:
                        System.out.println("");
                        System.out.println("Enter correct number!");
                        System.out.println("");
            }
            System.out.println("");
            System.out.println("");
            menu();
            System.out.println("");
            System.out.println("");
            System.out.print("Enter your choice : ");
            x = in.nextInt();
        }
        System.out.println("Thank you for banking with us");
    }

    public static boolean search(int id) {
        boolean found = false;
        for (int i : accounts.keySet()) {
            if (id == i) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static Account createAccount(int no, String name, float b) {
        Account a = new Account();
        a.insert(no, name, b);
        return a;
    }

    public static void menu() {
        System.out.println("Enter 1 to deposit money");
        System.out.println("Enter 2 to withdraw money");
        System.out.println("Enter 3 to check balance");
        System.out.println("Enter 4 to display informations");
        System.out.println("Enter 0 to exit");
    }

}
