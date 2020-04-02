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
public class LinearAlgebra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector4D vectorA = new Vector4D();
        vectorA.set(3, 1);
        Vector4D vectorB = new Vector4D();
        vectorB.set(3, 1);
        
        System.out.println("a: " + vectorA);
        System.out.println("b: " + vectorB);
        System.out.println("a * b: " + vectorA.dotProduct(vectorB));
        
        Matrix4x4 matrixA = new Matrix4x4();
        Matrix4x4 matrixB = new Matrix4x4();
        Matrix4x4 matrixC = matrixA.multiply(matrixB);
        
        System.out.println("a: " + matrixA);
        System.out.println("b: " + matrixB);
        System.out.println("a * b: " + matrixC);
    } // main(String[])
} // LinearAlgebra
