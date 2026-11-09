/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
public class Tut4Q1e {
    public static void main(String[] args) {
        double sum = 0;
        for (int numerator = 1; numerator <= 25; numerator++) {
            int denominator = 26 - numerator;
            sum += (double) numerator / denominator;
        }
        System.out.printf("Sum of series: %.2f\n", sum);
    }
}