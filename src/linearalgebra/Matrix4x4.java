/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearalgebra;

/**
 *
 * @author Brian Cochran
 */
public class Matrix4x4 {
    
    private double[][] elements = new double[4][4];
    
    public Matrix4x4() {
        this.identity();
    } // Matrix4x4()
    
    public double get(int row, int column) {
        return this.elements[row][column];
    } // get(int, int)
    
    public void set(int row, int column, double value) {
        this.elements[row][column] = value;
    } // set(int, int, double)
    
    public void identity() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    this.set(i, j, 1.0);
                } // if
                else {
                    this.set(i, j, 0.0);
                } // else
            } // for
        } // for
    } // identity()
    
    public Matrix4x4 multiply(Matrix4x4 m) {
        Matrix4x4 product = new Matrix4x4();
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                double sum = 0.0;
                for (int k = 0; k < 4; k++) {
                    sum += this.get(row, k) * m.get(k, column);
                } // for
                product.set(row, column, sum);
            } // for
        } // for
        return product;
    } // multiply(Matrix4x4)
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        
        result.append("[");
        for (int i = 0; i < 3; i++) {
            result.append(rowToString(i));
            result.append(",");
        } // for
        result.append(rowToString(3));
        result.append("]");
        return result.toString();
    } // toString()
    
    public String rowToString(int row) {
        StringBuilder result = new StringBuilder();
        
        result.append("(");
        for (int i = 0; i < 3; i++) {
            result.append(this.get(row, i));
            result.append(", ");
        } // for
        result.append(this.get(row, 3));
        result.append(")");
        return result.toString();
    } // rowToString(int)
    
    public static void main(String[] args) {
        Matrix4x4 a = new Matrix4x4();
        Matrix4x4 b = new Matrix4x4();
        Matrix4x4 c = a.multiply(b);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a * b: " + c);
    } // main(String[])
} // Matrix4x4