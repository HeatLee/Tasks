package by.bntu.poisit.poit.markevich.javatasks.task1.controller;

import by.bntu.poisit.poit.markevich.javatasks.task1.model.entity.Matrix;
import by.bntu.poisit.poit.markevich.javatasks.task1.model.logic.DeterminantFinder;
import by.bntu.poisit.poit.markevich.javatasks.task1.model.logic.MatrixFiller;
import by.bntu.poisit.poit.markevich.javatasks.task1.util.UserInput;
import by.bntu.poisit.poit.markevich.javatasks.task1.view.Printer;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        MatrixFiller matrixFiller = new MatrixFiller();
        DeterminantFinder determinantFinder = new DeterminantFinder();

        int degree = UserInput.inputInt("Input Matrix's degree: ");

        matrix = matrixFiller.fillRandom(degree);
        Printer.print(matrix);

        double determinant = determinantFinder.gaussMethod(matrix);

        Printer.print("Determinant = " + determinant);
    }
}
