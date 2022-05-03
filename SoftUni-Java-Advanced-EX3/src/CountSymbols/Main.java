package CountSymbols;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<Character,Integer> chars=new TreeMap<>();

        String input=sc.nextLine();

        for (int i = 0; i <input.length() ; i++) {
            if (chars.containsKey(input.charAt(i))){
                chars.put(input.charAt(i),chars.get(input.charAt(i))+1);
            }else {
                chars.put(input.charAt(i),1);
            }
        }

        chars.entrySet().stream()
                .forEach(e-> System.out.printf("%c: %d time/s%n",e.getKey(),e.getValue()));
    }
}
