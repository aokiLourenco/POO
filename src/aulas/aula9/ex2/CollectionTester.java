package aulas.aula9.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class CollectionTester {
    public static void main(String[] args) {
        int[] DIM = { 1000, 5000, 10000, 20000, 40000, 100000 };

        System.out.println(String.format("%10s %10d %10d %10d %10d %10d %10d", "Collection", DIM[0], DIM[1], DIM[2],
                DIM[3], DIM[4], DIM[5]));

        double[][] arrayListVal = new double[DIM.length][3];
        double[][] linkedLinkVal = new double[DIM.length][3];
        double[][] hashSetVal = new double[DIM.length][3];
        double[][] treeSetVal = new double[DIM.length][3];

        for (int i = 0; i < DIM.length; i++) {
            Collection<Integer> arrayList = new ArrayList<>();
            double[] values = checkPerformance(arrayList, DIM[i]);
            arrayListVal[i] = values;

            Collection<Integer> linkedLink = new LinkedList<>();
            values = checkPerformance(linkedLink, DIM[i]);
            linkedLinkVal[i] = values;

            Collection<Integer> hashSet = new HashSet<>();
            values = checkPerformance(hashSet, DIM[i]);
            hashSetVal[i] = values;

            Collection<Integer> treeSet = new TreeSet<>();
            values = checkPerformance(treeSet, DIM[i]);
            treeSetVal[i] = values;
        }

        System.out.println("ArrayList");
        printResults(arrayListVal, DIM);

        System.out.println("-".repeat(70));

        System.out.println("LinkedList");
        printResults(linkedLinkVal, DIM);

        System.out.println("-".repeat(70));

        System.out.println("HashSet");
        printResults(hashSetVal, DIM);

        System.out.println("-".repeat(70));

        System.out.println("TreeSet");
        printResults(treeSetVal, DIM);
    }

    private static void printResults(double[][] values, int[] DIM) {
        String[] tests = { "add", "search", "remove" };

        for (int i = 0; i < tests.length; i++) {
            System.out.print(String.format("%-10s", tests[i]));
            for (int j = 0; j < DIM.length; j++) {
                System.out.print(String.format("%10.2f", values[j][i]));
            }
            System.out.println();
        }
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, add, search, remove;

        // Add
        start = System.nanoTime();
        for (int i = 0; i < DIM; i++)
            col.add(i);
        stop = System.nanoTime();
        add = (stop - start) / 1e6;

        // Search
        start = System.nanoTime();
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            if (!col.contains(n))
                System.out.println("Not found???" + n);
        }
        stop = System.nanoTime();
        search = (stop - start) / 1e6;

        // Remove
        start = System.nanoTime();
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime();
        remove = (stop - start) / 1e6;

        return new double[] { add, search, remove };
    }
}