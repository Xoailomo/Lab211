/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0001;

import java.io.*;
import java.util.Scanner;

public class  bubbleSort{

    private static final Scanner in = new Scanner(System.in);
    // check user input a number integer   

    public static int checkInputInteger() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("ple input a number");
                System.out.print("Enter again: ");
            }
        }
    }

    // allow user input number of array 
    public static int inputSizeofArray() {
        System.out.println("Enter number of array:  ");
        int n = checkInputInteger();
        return n;
    }

    // allow user input value of array
    public static int[] inputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "]");
            a[i] = checkInputInteger();
        }
        return a;
    }
    // sort by bubble sort
    public static void bubbleaSort(int[] a) {
        System.out.print("Unsorted array: ");
        for(int i=0; i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        int i, j,temp;
        boolean swapped;
        for (i = 0; i < a.length - 1; i++) {
            swapped = false;
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
        System.out.println();
    }
    // display sorted array
    public static void printArray(int []a){
        int i;
        System.out.print("Sorted array: ");
        for(i = 0; i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    // main
    public static void main(String[] args) {
        int n = inputSizeofArray();
        int [] a= inputValueOfArray(n);
        bubbleaSort(a);
        printArray(a);
    }

}
