/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import array.array;
import validate.validate;
import display.display;
/**
 *
 * @author phank
 */
public class main {
    public static void main(String[] args) {
        int num = validate.inputInteger("Enter number of array",
                "error range(number>0)",
                "invalid ", 1,Integer.MAX_VALUE );
        array arr = new array(num);
        int key = validate.inputInteger("Enter search value: ", 
                "error range",
                "invalid ", Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println("They array: ");
        System.out.println(arr.toString());
        int index = arr.search(key);
        display dis = new display();
        dis.display(index,key,"found "+key+" at index: ", "not found");
            
    }
}
