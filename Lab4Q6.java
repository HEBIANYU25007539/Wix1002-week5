/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
// Q6
import java.util.Random;
public class Lab4Q6 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(999999999);
        System.out.println("Random integer: " + num);
        String s = String.valueOf(num);
        int digits = s.length();
        System.out.println("Number of digits: " + digits);
    }
}