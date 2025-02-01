package controller;

/**
 *
 * @author Alumno
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        double a = 147, b = 39;
        
        System.out.println("La suma de a+b es " + (a + b));
        System.out.println("La resta de a-b es " + (a - b));
        System.out.println("La multiplicacion de a*b es " + (a * b));
        System.out.println("La division de a/b es " + (a / b));
        System.out.println("El resto de a%b es " + (a % b));
        
        a++; // aumentar en la unidad
        System.out.println("El valor de a después de a++ es " + a);
        b--; // disminuir en la unidad
        System.out.println("El valor de b después de b-- es " + b);
    }
}
