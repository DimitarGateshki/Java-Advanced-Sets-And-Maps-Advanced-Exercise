package FixEmails;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> elements=new LinkedHashMap<>();
        String name=sc.nextLine();
        String email= sc.nextLine();


        while (!name.equals("stop")){
            if (!email.substring(email.length()-3,email.length()).equals(".bg")){

            }else {
                elements.putIfAbsent(name, email);
            }
            name=sc.nextLine();
            if (!name.equals("stop")) {
                email = sc.nextLine();
            }
        }


        elements.entrySet().stream()
                .forEach(e-> System.out.printf("%s -> %s%n",e.getKey(),e.getValue()));




    }
}
