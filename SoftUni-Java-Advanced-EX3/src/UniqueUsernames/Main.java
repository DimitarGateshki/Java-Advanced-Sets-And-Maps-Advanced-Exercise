package UniqueUsernames;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashSet<String> names= new LinkedHashSet<>();

        String input;

        int lines=Integer.parseInt(sc.nextLine());

        for (int i = 0; i <lines ; i++) {
            input=sc.nextLine();
            names.add(input);
        }

        for (String e:names) {
            System.out.println(e);
        }
    }
}
