package week3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Thread1 {
    static int si = 100, c = 5;

    public static int[] a = new int[si];
    public static int[] partialSums = new int[c];

    public static void main(String[] args) {
        for (int i = 0; i < si; i++) {
            a[i] = i + 1;
        }
        ExecutorService executor = Executors.newFixedThreadPool(c);
        for (int i = 0; i < c; i++) {
            int startIndex = i * (si / c);
            int endIndex = startIndex + (si / c);
            executor.execute(new PartialSum(i, startIndex, endIndex));
        }
        executor.shutdown();
        int finalSum = 0;
        for (int sum : partialSums) {
            finalSum += sum;
        }

        System.out.println("Final sum: " + finalSum);
    }

}