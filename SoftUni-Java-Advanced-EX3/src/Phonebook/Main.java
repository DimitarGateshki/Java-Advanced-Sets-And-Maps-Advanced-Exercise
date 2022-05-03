package Phonebook;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<String,String> subscribers=new TreeMap<>();

        String[] input=sc.nextLine().split("\\-");

        String name;
        String number;

        while (!input[0].equals("search")){
            name=input[0];
            number=input[1];
            subscribers.putIfAbsent(name,number);
            subscribers.put(name,number);
            input=sc.nextLine().split("\\-");
        }

        name=sc.nextLine();



        while (!name.equals("stop")){
            if (subscribers.containsKey(name)){
                System.out.printf("%s -> %s%n",name,subscribers.get(name));

            }else {
                System.out.printf("Contact %s does not exist.%n",name);
            }
            name=sc.nextLine();

        }
    }
}
