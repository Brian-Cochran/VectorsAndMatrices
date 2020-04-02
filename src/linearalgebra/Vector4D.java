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
public class Vector4D {
    private double[][] elements = new double[4][1];
    
    public Vector4D() {
        for (int i = 0; i < 4; i++) {
            this.set(i, 0);
        } // for
    } // Vector4D()
    
    public double get(int row) {
        return this.elements[row][0];
    } // get(int)
    
    public void set(int row, double value) {
        this.elements[row][0] = value;
    } // set(int, double)
    
    public Vector4D dotProduct(Vector4D v) {
        for (int i = 0; i < 4; i++) {
            this.set(i, this.get(i) +  v.get(i));
        } // for
        return this;
    } // dotProduct(Vector4D)
    
    @Override
    public String toString() {
        return "(" + get(0) + ", " + get(1) + ", " + get(2) + ", " + get(3) + ")";
    } // toString()
    
    public static void main(String[] args) {
        Vector4D a = new Vector4D();
        a.set(3, 1);
        Vector4D b = new Vector4D();
        b.set(3, 1);
        
        
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a * b: " + a.dotProduct(b));
    } // main(String[])
}
