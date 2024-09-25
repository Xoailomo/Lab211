/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Random;

/**
 *
 * @author phank
 */
public class array {

    private int[] array;

    public array(int size) {
        Random ran = new Random();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ran.nextInt(size);
        }
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1) {
                str += ", ";
            }
        }
        str += "]";

        return str;
    }

    public int search(int key) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
