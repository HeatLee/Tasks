package by.bntu.poisit.poit.markevich.javatasks.task1.model.logic;

import by.bntu.poisit.poit.markevich.javatasks.task1.model.entity.Matrix;

import java.util.Random;

public class MatrixFiller {

    public Random random = new Random();
    private int FILL_RANGE = 100;

    public Matrix fillRandom(int degree){
        Matrix temp = new Matrix(new double[degree][degree]);
        for (int i = 0; i < temp.getRows(); i++) {
            for (int j = 0; j < temp.getColumns(); j++) {
                temp.setElement(i, j, random.nextInt(FILL_RANGE) + random.nextDouble());
            }
        }
        return temp;
    }
    public void setFILL_RANGE(int FILL_RANGE) {
        this.FILL_RANGE = FILL_RANGE;
    }
}
