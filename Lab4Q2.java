/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
// Q2
import java.util.Scanner;
public class Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long total = 0;
        for(int i = 1; i <= n; i++){
            long sub = (long)i * (i + 1) / 2;
            total += sub;
        }
        System.out.println(total);
        sc.close();
    }
}