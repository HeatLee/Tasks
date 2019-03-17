package by.bntu.poisit.poit.markevich.javatasks.task1.model.logic;

import by.bntu.poisit.poit.markevich.javatasks.task1.model.entity.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class testMethods {

    @Test
    public void testNullMatrix() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix(new double[][]{null});
        Assert.assertEquals(Double.NaN, determinantFinder.gaussMethod(matrix), 0.00001);
    }

    @Test
    public void testNullRowsMatrix() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix(new double[][]{
                null,
                null,
                null});
        Assert.assertEquals(Double.NaN, determinantFinder.gaussMethod(matrix), 0.00001);
    }

    @Test
    public void testTriangleMatrix() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix(new double[][]{
                {1,124,14},
                {0,2,34},
                {0,0,3}});
        Assert.assertEquals(6.0D, determinantFinder.gaussMethod(matrix), 0.00001);
    }

    @Test
    public void testEmptyMatrix() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix();
        Assert.assertEquals(Double.NaN, determinantFinder.gaussMethod(matrix), 0.00001);
    }

    @Test
    public void testNullObject() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = null;
        Assert.assertEquals(Double.NaN, determinantFinder.gaussMethod(matrix), 0.00001);
    }

    @Test
    public void testUnequalRowsLength() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix(new double[][]{
                {12,124,14,123},
                {0,0},
                {0,0,0}});
        Assert.assertEquals(Double.NaN, determinantFinder.gaussMethod(matrix), 0.00001);
    }


    @Test
    public void testNullRow() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix(new double[][]{
                null,
                {0,0,0},
                {0,0,0}});
        Assert.assertEquals(Double.NaN, determinantFinder.gaussMethod(matrix), 0.00001);
    }

    @Test
    public void testZeroValue() {
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix(new double[][]{ {0,0,0},
                                                   {0,0,0},
                                                   {0,0,0}});
        Assert.assertEquals(0, determinantFinder.gaussMethod(matrix), 0.0001);
    }


    @Test
    public void testMethod(){
        DeterminantFinder determinantFinder = new DeterminantFinder();
        Matrix matrix = new Matrix(new double[][]{ {73, 7, 6},
                                                   {110,16,19},
                                                   {148, 10, 7}});
        Assert.assertEquals(992.0d, determinantFinder.gaussMethod(matrix), 0.000001);
    }
}
