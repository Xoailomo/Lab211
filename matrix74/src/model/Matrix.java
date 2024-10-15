/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author phank
 */
public class Matrix {

    private int row, column;
    private int[][] data;

    public Matrix() {
    }

    public Matrix(int row, int column, int[][] data) {
        // check row and col equal to data. =>for reuse in other case
        if (data == null || row != data.length || column != data[0].length) {
            throw new IllegalArgumentException("data of matrix not match with provided");
        }
        if (row <= 0 || column <= 0) {
            throw new IllegalArgumentException("row and column must >0");
        }
        this.row = row;
        this.column = column;
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.format("[%d]", data[i][j]);
            }
            System.out.println();
        }
    }

    public void setData(int i, int j, int result) {
        if (i < 0 || j < 0 || i >= row || j >= column) {
            throw new IllegalArgumentException("index out of bounds");
        }
        this.data[i][j] = result;
    }

    public Matrix addition(Matrix that) throws Exception {
        if (row != that.getRow() || column != that.getColumn()) {
            throw new Exception("2 matrixes must have the same size");
        }
        Matrix res = new Matrix(row, column, new int[row][column]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res.setData(i, j, data[i][j] + that.getData()[i][j]);
            }
        }
        return res;
    }

    public Matrix substraction(Matrix that) throws Exception {
        if (row != that.getRow() || column != that.getColumn()) {
            throw new Exception("2 matrixes must have the same size");
        }
        Matrix res = new Matrix(row, column, new int[row][column]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res.setData(i, j, data[i][j] - that.getData()[i][j]);
            }
        }
        return res;
    }

    public Matrix multiplication(Matrix that) throws Exception {
        if (column != that.getRow()) {
            throw new Exception("column matrix 1 must = row matrix 2");
        }
        Matrix res = new Matrix(row, that.getColumn(), new int[row][that.getColumn()]);
        int sum;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < that.getColumn(); j++) {
                sum = 0;
                for (int k = 0; k < that.getRow(); k++) {
                    sum += data[i][k] * that.getData()[k][j];
                }
                res.setData(i, j, sum);
            }
        }
        return res;
    }
}
