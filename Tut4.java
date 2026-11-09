/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tut4;

/**
 *
 * @author hebianyu
 */
public class Tut4 {
    public static void main(String[] args) {
        int n = 1;
        while ((n + 1) * (n + 1) * (n + 1) < 2000) {
            n++;
        }
        System.out.println("Largest n: " + n);
    }
}