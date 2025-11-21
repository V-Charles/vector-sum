package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] vect;
        double sum, avg;

        System.out.print("How many numbers are you going to type? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Invalid quantity!");
        } else {
            vect = new double[n];
            for (int i=0; i< vect.length; i++) {
                System.out.print("Enter a number: ");
                vect[i] = sc.nextDouble();
            }

            sum = 0;
            for (int i=0; i< vect.length; i++) {
                sum += vect[i];
            }
            avg = sum/vect.length;

            System.out.println("-------------");
            System.out.print("Values: ");
            for (int i=0; i<vect.length; i++) {
                System.out.printf("%.1f - ", vect[i]);
            }
            System.out.printf("\nSum: %.2f\n", sum);
            System.out.printf("Average: %.2f\n", avg);
        }

        sc.close();
    }
}