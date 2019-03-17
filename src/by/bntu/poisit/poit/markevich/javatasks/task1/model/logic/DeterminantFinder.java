package by.bntu.poisit.poit.markevich.javatasks.task1.model.logic;

import by.bntu.poisit.poit.markevich.javatasks.task1.model.entity.Matrix;

public class DeterminantFinder {

    public double gaussMethod(Matrix matrix) {
        double determinant = Double.NaN;
        if (matrix != null && matrix.isValidMatrix()) {
            if (isTriangleMatrix(matrix)) {
                determinant = countDeterminant(matrix);
            } else {
                setTriangleMatrix(matrix);
                determinant = countDeterminant(matrix);
            }
        }
        return determinant;
    }

    private double countDeterminant(Matrix matrix) {
        double determinant = 1;
        for (int i = 0; i < matrix.getRows(); i++) {
            determinant *= matrix.getElement(i, i);
        }
        return determinant;
    }

    private boolean isTriangleMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < i; j++) {
                if (matrix.getElement(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void setNullsBottomI(Matrix matrix, int elementsIndex) {
        double value = matrix.getElement(elementsIndex, elementsIndex);
        for (int i = elementsIndex + 1; i < matrix.getRows(); i++) {
            double factor = -1 * matrix.getElement(i, elementsIndex) / value;
            for (int j = 0; j < matrix.getColumns(); j++) {
                double temp = matrix.getElement(i, j) + factor * matrix.getElement(elementsIndex, j);
                matrix.setElement(i, j, temp);
            }
        }
    }

    public void setTriangleMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            setNullsBottomI(matrix, i);
        }
    }

}
