package pc;

import java.util.Arrays;

/**
 * Created by dawid on 26.11.16.
 */
public class Function{
    String name;
    double[] vector;
    double[] vectorB;
    double[] triad;
    double[][] matrix;
    int row;
    int column;
    int[] list;
    double result;
    double valueToSet;
    int numberOfTriads;

    public double[] getTriad() {
        return triad;
    }

    public void setTriad(double[] triad) {
        this.triad = triad;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getNumberOfTriads() {
        return numberOfTriads;
    }

    public void setNumberOfTriads(int numberOfTriads) {
        this.numberOfTriads = numberOfTriads;
    }

    public double getValueToSet() {
        return valueToSet;
    }

    public void setValueToSet(double valueToSet) {
        this.valueToSet = valueToSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                ", vector=" + Arrays.toString(vector) +
                ", matrix=" + Arrays.deepToString(matrix) +
                ", row=" + row +
                ", column=" + column +
                ", list=" + Arrays.toString(list) +
                ", result=" + result +
                '}';
    }
}
