package application;

import entities.Acount;
import entities.BusinessAccount;
import entities.SavesAccount;

public class UpcastingDowncasting {
    public static void main(String[]args){
        Acount acc = new Acount(1001, "Alex", 0.0);
        BusinessAccount bcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        Acount acc1 = bcc;
        Acount acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Acount acc3 = new SavesAccount(1004, "Anna", 0.0, 0.01);

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan: ");
        }
        if (acc3 instanceof SavesAccount){
            SavesAccount acc5 = (SavesAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
