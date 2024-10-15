/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.Matrix;
import view.inputData;
import view.viewMatrix;

/**
 *
 * @author phank
 */
public class main {

    public static void main(String[] args) {
        int[][] data = {
            {1, 2, 3},
            {4, 5, 6}
        };
        viewMatrix view = new viewMatrix();
        inputData inp = new inputData();
        int choice;
        while (true) {
            view.menu();
            choice = inp.getInt("your's choice: ",
                    "must [1-3] or 0", "invalid",
                    1, 4);
            switch (choice) {
                case 1:
                    view.displayAdd();
                    break;
                case 2:
                    view.displaySub();
                    break;
                case 3:
                    view.displayMul();
                    break;
//                case 4:
//                    Matrix matrix = new Matrix(3, 3, data);
//                    matrix.display();
//                    break;
                default:
                    System.exit(0);

            }
        }
    }
}
