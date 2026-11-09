/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
// Q8
import java.util.ArrayList;
import java.util.Random;
public class Lab4Q8 {
    public static boolean isPrime(int x){
        if(x < 2) return false;
        for(int k = 2; k <= Math.sqrt(x); k++){
            if(x % k == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(101);
        ArrayList<Integer> primes = new ArrayList<>();
        int candidate = 2;
        while(primes.size() < n){
            if(isPrime(candidate)){
                primes.add(candidate);
            }
            candidate++;
        }
        System.out.println("n = " + n);
        System.out.println("First n primes: " + primes);
    }
}
