package PeriodicTable;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Set<String> elements=new TreeSet<>();

        int lines=Integer.parseInt(sc.nextLine());

        String[] input;

        for (int i = 0; i < lines; i++) {
            input=sc.nextLine().split("\\s+");
            for (String e:input) {
                elements.add(e);
            }
        }

        for (String e:elements) {
            System.out.print(e+" ");
        }
    }
}
