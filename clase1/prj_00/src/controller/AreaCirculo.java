package controller;

/**
 *
 * @author Juan Herencia
 */
public class AreaCirculo {
    public static void main(String[] args) {
        // Calcular el área de una
        // circunferencia de radio = 2.5
        // Operador de asignación es =
        // nom_variable = valor; // nom_variable almacena valor.
        float radio = 5f; // declaración o definición de la variable
                            // Tipo_de_dato  nombre_variable;
                            // radio tiene asignado un valor inicial
        float area; // variable sin valor inicial
        final float pi = 3.141592654f; // pi es una constante
                                       // no se puede cambiar
        
        area = pi * radio * radio;
        
        System.out.println("El area de un circulo de radio " + radio + " es " + area);
        
        //pi = 3.13f; // pi es de solo lectura
        System.out.println("pi es " + pi);    
                
    }
}

/*
   Angie Tello
   Liam Giraldo
   Luz Bustamante
   David Huanasca
   Brandon Corzo
*/