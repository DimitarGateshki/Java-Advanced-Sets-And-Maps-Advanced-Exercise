package HandsOfCards;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, HashSet<String>> elements = new LinkedHashMap<>();


        while (!input.equals("JOKER")) {
            String[] token = input.split(": ");
            String name = token[0];
            List<String> cards = Arrays.stream(token[1].split(", "))
                    .collect(Collectors.toList());
            elements.putIfAbsent(name, new HashSet<>());
            elements.get(name).addAll(cards);
            input = sc.nextLine();
        }
        elements.forEach((key, value) -> {
            int power = calculate(value);
            System.out.printf("%s: %d%n", key, power);

        });
    }




    private static int calculate(HashSet<String> value) {
        int power =0;
        for (String card:value) {
            power += calcCardPower(card);

        }
        return power;
    }

    private static int calcCardPower(String card) {
        int power=0;
        char firstLetter = card.charAt(0);
        if(Character.isDigit(firstLetter)){
            int[] powers = {0,10, 2, 3, 4, 5, 6, 7, 8, 9};
            power +=powers[card.charAt(0) - '0'];
        }else{
            switch (firstLetter){
                case 'J':
                    power+=11;
                    break;
                case 'Q':
                    power+=12;
                    break;
                case 'K':
                    power+=13;
                    break;
                case 'A':
                    power+=14;
                    break;
            }
        }

        switch (card.charAt(card.length() - 1)) {
            case 'S':
                power *= 4;
                break;
            case 'H':
                power *= 3;
                break;
            case 'D':
                power *= 2;
                break;
        }

        return power;
    }
}
