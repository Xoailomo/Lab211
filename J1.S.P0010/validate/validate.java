/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import java.util.Scanner;

/**
 *
 * @author phank
 */
public class validate {

    private static final Scanner sc = new Scanner(System.in);

    public static int inputInteger(
            String message,
            String messageErrorOutOfRange,
            String messageErrorInvalidNumber,
            int min, int max) {
        do {
            try {
                System.out.println(message);
                int num = Integer.parseInt(sc.nextLine());
                if (num >= min && num <= max) {
                    return num;
                } else {
                    System.out.println(messageErrorOutOfRange);
                }
            } catch (NumberFormatException e) {
                System.out.println(messageErrorInvalidNumber);
            }
        }while(true);
    
    }
}
