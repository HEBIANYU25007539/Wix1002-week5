/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
// Q7
import java.util.Scanner;
public class Lab4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double iYear = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();
        double r = iYear / (12 * 100);
        double M = P * r / (1 - Math.pow(1 + r, -N));
        double rem = P;
        double totalInt = 0;
        System.out.printf("%-6s%-16s%-12s%-12s%-16s%s%n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        for(int n = 1; n <= N; n++){
            double intDue = rem * r;
            double prinPay = M - intDue;
            rem = rem - prinPay;
            totalInt += intDue;
            System.out.printf("%-6d%-16.2f%-12.2f%-12.2f%-16.2f%.2f%n",n,M,prinPay,intDue,rem,totalInt);
        }
        sc.close();
    }
}