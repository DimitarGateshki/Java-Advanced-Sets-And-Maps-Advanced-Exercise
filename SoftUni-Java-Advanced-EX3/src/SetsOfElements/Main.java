package SetsOfElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] lengths= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        HashSet<Integer> set1=new LinkedHashSet<>();
        HashSet<Integer> set2=new LinkedHashSet<>();

        HashSet<Integer> simSet=new LinkedHashSet<>();

        int next;

        for (int i = 0; i < lengths[0]; i++) {
            next=Integer.parseInt(sc.nextLine());
            set1.add(next);
        }

        for (int i = 0; i < lengths[1]; i++) {
            next=Integer.parseInt(sc.nextLine());
            set2.add(next);
        }

        for (Integer e:set1) {
            if (set2.contains(e)){
                simSet.add(e);
            }
        }

        for (Integer e:set2) {
            if (set1.contains(e)){
                simSet.add(e);
            }
        }

        for (Integer e:simSet) {
            System.out.print(e+" ");
        }

    }
}
