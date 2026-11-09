/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
public class Tut4Q2b {
    public static void main(String[] args) {
        int x = 0, y = 0;
        do {
            x += 2;
            y += x;
            System.out.println(x + " " + y);
        } while (x < 100);
    }
}