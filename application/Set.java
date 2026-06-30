package application;

import java.util.HashSet;

public class Set {

    public static void main(String [] args){
        java.util.Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Computer");

        set.remove("Tablet");
        set.removeIf(x -> x.length() >= 3);

        System.out.println(set.contains("Notebook"));

        for (String p : set){
            System.out.println(p);
        }
    }
}
