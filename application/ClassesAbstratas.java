package application;

import entities.Acount;
import entities.BusinessAccount;
import entities.SavesAccount;

import java.util.ArrayList;
import java.util.List;

public class ClassesAbstratas {
    public static void main(String[] args){

        List <Acount> list = new ArrayList<>();

        list.add(new SavesAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));

        double sum = 0.0;
        for (Acount acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Acount acc : list){
            acc.deposit(10.0);
        }
        for (Acount acc : list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
