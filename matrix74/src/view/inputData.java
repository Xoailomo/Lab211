/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author phank
 */
public class inputData {

    private final static Scanner sc = new Scanner(System.in);
    public int getInt(String info, String error,
            String invalid, int min, int max) {
        do {
            System.out.print(info);
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                }
                System.out.println(error);
            } catch (NumberFormatException e) {
                System.out.println(invalid);
            }
        } while (true);
    }
}
