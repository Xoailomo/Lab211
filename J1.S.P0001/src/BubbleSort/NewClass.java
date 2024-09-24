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
public class NewClass {
    private static final Scanner sc = new Scanner(System.in);
    public static int validate(){
        int n;
        while(true){
        String inp = sc.nextLine().trim();// read single token
        if(inp.startsWith("0") && inp.length() > 1){
            System.out.println("Input must not have leading zeros");
            System.out.println("pls enter a positive integer: ");
            continue;
        }   
        try{
            n=Integer.parseInt(inp);
                if(n > 0){
                    return n;
                } else{
                    System.out.println("Input must be a positive number");
                }
                
            }catch(NumberFormatException e){
                System.out.println("Invalid input. pls enter a positive integer");
            }
            System.out.print("pls enter a positive number: ");
        }
        
    }
    public static int inputSize(){
        System.out.println("Enter number of array: ");
        return validate();
    }
    public static int[] getRandomArray(int size){
        Random random = new Random();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=random.nextInt(size);
        }
        return arr;
    }
    
    public static int[] bubbleSort(int []arr){
        int n = arr.length;
        boolean swapped;
        int tem;
        for(int i = 0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                    swapped = true;
                }
            }
            if(swapped==false)
                break;
        }
        return arr;
    }
    public static void displayArray(int []arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int n = inputSize();
        int arr[] = getRandomArray(n);
        System.out.println("unsorted array: ");
        displayArray(arr);
        int[] sortedArray = bubbleSort(arr);
        System.out.println("Sorted array: ");
        displayArray(sortedArray);
        sc.close();
    }
    
}
