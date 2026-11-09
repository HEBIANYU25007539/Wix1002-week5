/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
// Q5
import java.util.Random;
public class Lab4Q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int p1 = 0, p2 = 0;
        int turn = 1;
        while(p1 <= 100 && p2 <= 100){
            if(turn == 1){
                System.out.println("\nPlayer 1's turn");
                int roll = rd.nextInt(6)+1;
                System.out.println("Rolled: " + roll);
                p1 += roll;
                if(roll != 6){
                    turn = 2;
                }else{
                    System.out.println("Roll 6! Roll again.");
                }
            }else{
                System.out.println("\nPlayer 2's turn");
                int roll = rd.nextInt(6)+1;
                System.out.println("Rolled: " + roll);
                p2 += roll;
                if(roll != 6){
                    turn = 1;
                }else{
                    System.out.println("Roll 6! Roll again.");
                }
            }
        }
        System.out.println("\nPlayer1: " + p1 + ", Player2: " + p2);
        if(p1 > 100){
            System.out.println("Player 1 wins!");
        }else{
            System.out.println("Player 2 wins!");
        }
    }
}
