/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
// Q3
import java.util.ArrayList;
import java.util.Scanner;
public class Lab4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        while(true){
            System.out.print("Enter a score [negative score to quit]:");
            double val = sc.nextDouble();
            if(val < 0) break;
            scores.add(val);
        }
        int N = scores.size();
        double min = scores.get(0);
        double max = scores.get(0);
        double sumX = 0;
        double sumX2 = 0;
        for(double s : scores){
            if(s < min) min = s;
            if(s > max) max = s;
            sumX += s;
            sumX2 += s * s;
        }
        double avg = sumX / N;
        double std = Math.sqrt((sumX2 - (sumX * sumX) / N) / (N - 1));
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f%n", avg);
        System.out.printf("Standard Deviation: %.2f%n", std);
        sc.close();
    }
}
