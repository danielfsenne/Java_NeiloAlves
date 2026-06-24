package application;

import devices.ComboDevice;
import devices.ConcretPrinter;
import devices.ConcretScanner;

public class ProblemaDoDiamante {
    public static void main(String []args){

        ConcretPrinter p =new ConcretPrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcretScanner s = new ConcretScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result:" + s.scan());

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
