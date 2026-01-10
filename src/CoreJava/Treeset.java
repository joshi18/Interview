package src.CoreJava;

import src.Main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Treeset {
//    synchronized {
//
//    }

    public static void main(String[] args) {
        // System.out.println("Abhijit");

        Comparator<Custmoer> idComparator =
                (e1, e2) -> CharSequence.compare(e1.Name, e2.Name);


        Set<Custmoer> abc = new TreeSet<>(idComparator);
        Custmoer c1 = new Custmoer(1, "Abhijit");
        Custmoer c2 = new Custmoer(2, "Tejas");
        Custmoer c3 = new Custmoer(3, "Pranita");


        abc.add(c1);
        abc.add(c2);
        abc.add(c3);


        for (Custmoer c11 : abc) {
            System.out.println(c11);
        }


    }

    public synchronized void getAllElements() {

    }
}
