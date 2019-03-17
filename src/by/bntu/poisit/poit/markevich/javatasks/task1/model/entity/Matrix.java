package by.bntu.poisit.poit.markevich.javatasks.task1.model.entity;

import java.util.Arrays;

public class Matrix {
    private double[][] data;

    public Matrix() {
        data = new double[0][0];
    }

    public Matrix(double[][] data) {
        if(data != null) {
            this.data = Arrays.copyOf(data, data.length);
        } else {
            this.data = new double[0][0];
        }
    }

    public Matrix(Matrix matrix) {
        this.data = matrix.data;
    }

    public double[][] getData() {
        return data;
    }

    public void setData(double[][] data) {
        this.data = data;
    }

    public int getRows() {
        return data.length;
    }

    public int getColumns() {
        return data[0].length;
    }

    public void setElement(int row, int column, double value) {
        data[row][column] = value;
    }

    public double getElement(int row, int column) {
        return data[row][column];
    }

    public boolean isValidMatrix() {
        for (double[] row : data) {
            if (row == null) {
                return false;
            }
        }
        return (!isEmpty() && isSquareMatrix() && isEqualsRowsLength() &&  ! isNullMatrix());
    }

    private boolean isEmpty() {
        return data.length == 0;
    }

    private boolean isSquareMatrix() {
        return data.length == data[0].length;
    }

    private boolean isNullMatrix() {
        return data == null;
    }

    private boolean isEqualsRowsLength() {
        int length = data[0].length;
        for (double[] rows : data) {
            if (rows.length != length) {
                return false;
            }
        }
        return true;
    }

    public boolean isZeroMatrix() {
        for (double[] row : data) {
            for (double element : row) {
                if (element != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (double[] row : this.data) {
            for (double element : row) {
                stringBuilder.append(element).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
