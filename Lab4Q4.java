/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
// Q4
import java.util.Scanner;
public class Lab4Q4 {
    public static int printMonth(int year, int startDay, int days, String name){
        System.out.println("\n" + name + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i = 0; i < startDay; i++){
            System.out.print("    ");
        }
        int curr = startDay;
        for(int d = 1; d <= days; d++){
            System.out.printf("%3d", d);
            curr++;
            if(curr % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
        return curr % 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        System.out.print("Enter first day of the year (0=Sun,1=Mon...6=Sat): ");
        int firstDay = sc.nextInt();
        boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        int feb = leap ? 29 : 28;
        int[] monthDays = {31, feb, 31, 30, 31, 30, 31, 31};
        int dayPtr = firstDay;
        for(int i = 0; i < 4; i++){
            dayPtr = (dayPtr + monthDays[i]) % 7;
        }
        dayPtr = printMonth(y, dayPtr, monthDays[4], "May");
        dayPtr = (dayPtr + monthDays[5]) % 7;
        dayPtr = (dayPtr + monthDays[6]) % 7;
        printMonth(y, dayPtr, monthDays[7], "August");
        sc.close();
    }
}