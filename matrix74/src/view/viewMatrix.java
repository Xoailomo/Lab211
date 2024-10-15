/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Constant;
import controller.controller;
import model.Matrix;

/**
 *
 * @author phank
 */
public class viewMatrix {

    controller co = new controller();
    Matrix m1;
    Matrix m2;
    Matrix res;

    public void menu() {
        String contents[] = {"add", "sub", "mul"};
        System.out.println("*****calculator*****");
        for (int i = 0; i < contents.length; i++) {
            System.out.println((i + 1) + ". " + contents[i]);
        }
        System.out.println("4. exits");
    }

    public void displayAdd() {
        System.out.println("*****Addition****");
        m1 = co.getMatrix1();
        m2 = co.getMatrix2(m1, Constant.regexaddition);
        System.out.println("******result*****");
        m1.display();
        System.out.println("+");
        m2.display();
        System.out.println("=");
        try {
            res=m1.addition(m2);
            res.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void displaySub() {
        System.out.println("*****substraction****");
        m1 = co.getMatrix1();
        m2 = co.getMatrix2(m1, Constant.regexsubtraction);
        System.out.println("******result*****");
        m1.display();
        System.out.println("-");
        m2.display();
        System.out.println("=");
        try {
            res=m1.substraction(m2);
            res.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayMul() {
        System.out.println("******multiplication*****");
        m1 = co.getMatrix1();
        m2 = co.getMatrix2(m1, Constant.regexmultiplication);
        System.out.println("*******result***********");
        m1.display();
        System.out.println("*");
        m2.display();
        System.out.println("=");
        try {
            res=m1.multiplication(m2);
            res.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
