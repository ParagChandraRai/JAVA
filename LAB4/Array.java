import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        // Task a: Display element 6 of array f
        int[] f = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Element 6 of array f: " + f[6]);
        
        // Task b: Initialize each element of array g to 8
        int[] g = new int[5];
        Arrays.fill(g, 8);
        System.out.println("Array g: " + Arrays.toString(g));
        
        // Task c: Total the elements of array c
        double[] c = new double[100];
        double total = 0.0;
        for (int i = 0; i < c.length; i++) {
            c[i] = i * 0.5;
            total += c[i];
        }
        System.out.println("Total of array c: " + total);
        
        // Task d: Copy array a into the first portion of array b
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] b = new int[34];
        System.arraycopy(a, 0, b, 0, 11);
        System.out.println("Array b: " + Arrays.toString(b));
        
        // Task e: Find the smallest and largest values in array w
        double[] w = new double[99];
        for (int i = 0; i < w.length; i++) {
            w[i] = Math.random() * 100;
        }
        double min = w[0];
        double max = w[0];
        for (int i = 1; i < w.length; i++) {
            if (w[i] < min) {
                min = w[i];
            }
            if (w[i] > max) {
                max = w[i];
            }
        }
        System.out.println("Smallest value in array w: " + min);
        System.out.println("Largest value in array w: " + max);
    }
}
