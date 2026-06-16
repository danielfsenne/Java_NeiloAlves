package application;

import entities.Acount;
import entities.BusinessAccount;
import entities.SavesAccount;

public class Sobreposicao {
    public static void main(String[] args){
        Acount acc1 = new Acount(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Acount acc2 = new SavesAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Acount acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
