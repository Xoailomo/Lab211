/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Constant;
import model.Matrix;
import view.inputData;

/**
 *
 * @author phank
 */
public class controller {

    inputData inp = new inputData();

    public Matrix getMatrix1() {
        int row = inp.getInt("row matrix 1: ", "row matrix must >0",
                "pls integer bro", 1, Integer.MAX_VALUE);
        int column = inp.getInt("colum matrx 1: ", "must>0",
                "pls integer", 1, Integer.MAX_VALUE);

        Matrix a = new Matrix(row, column,new int[row][column]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a.setData(i, j, inp.getInt(String.format("Enter Matrix1 [%d][%d]: ", i+1, j+1),
                        "Error range", "Values of matrix is digit",
                        Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
        }
        return a;

    }

    public Matrix getMatrix2(Matrix a, char opr) {
        int rowMatrixb = 0;
        int colMatrixb = 0;
        if (opr == Constant.regexaddition || opr == Constant.regexsubtraction) {
            rowMatrixb = inp.getInt("row matrix 2: ",
                    "row matrix b must  = row matrix a",
                    "pls integer", a.getRow(), a.getRow());
            colMatrixb = inp.getInt("col matrix 2: ",
                    "col matrix b = col matrix a",
                    "pls integer", a.getColumn(), a.getColumn());
        }
        if (opr == Constant.regexmultiplication) {
            rowMatrixb = inp.getInt("row matrix 2: ",
                    "row matrix b must = col matrix a",
                    "psl integer", a.getColumn(), a.getColumn());
            colMatrixb = inp.getInt("col matrix 2: ",
                    "must > 0",
                    "pls integer", 1, Integer.MAX_VALUE);
        }
        Matrix b = new Matrix(rowMatrixb,colMatrixb,new int[rowMatrixb][colMatrixb]);
        for (int i = 0; i < rowMatrixb; i++) {
            for (int j = 0; j < colMatrixb; j++) {
                b.setData(i, j, inp.getInt(String.format("Enter Matrix2 [%d][%d]: ", i+1, j+1),
                        "Error range", "Values of matrix is digit",
                        Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
        }
        return b;

    }
}
