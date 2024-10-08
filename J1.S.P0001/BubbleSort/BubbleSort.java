/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BubbleSort;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phank
 */
public class BubbleSort {
    private static final Scanner sc = new Scanner(System.in);
    public static int validate(){
        int n;
        while(true){
            String inp=sc.nextLine().trim();
            try{
                n = Integer.parseInt(inp);
                if(n > 0){
                    return n;
                } else{
                    System.out.println("pls enter positive integer");
                }
            } catch(NumberFormatException e){
                System.out.println("invalid input. pls enter positive integer: ");
            }
            
        }
    }
    public static int getSizeofArray(){
        System.out.println("Enter number of array: ");
        return validate();
    }
    public static int[] getRandom(int size){
        Random random = new Random();
        int a[]=new int[size];
        for(int i =0; i< size;i++){
            a[i]=random.nextInt(size);
        }
        return a;
    }
    public static int[] bubbleSort(int a[]){
        int n = a.length;
        int tem;
        boolean swapped;
        for(int i = 0;i<n;i++){
            swapped = false;
            for(int j = 0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    tem = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tem;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        return a;
    }
    public static void displayArray(int []a){
        System.out.print("[");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
            if(i<a.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int n = getSizeofArray();
        int a[] = getRandom(n);
        System.out.println("Unsorted array: ");
        displayArray(a);
        int [] sortedArray = bubbleSort(a);
        displayArray(sortedArray);
        sc.close();
    }
}
