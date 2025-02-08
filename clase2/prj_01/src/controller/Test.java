package controller;

/*
import model.Alumno;
import model.Curso;
*/
import model.*; // importa todas las clases de model.

/**
 * Esta clase es para probar las funcionalidades de las clases definidas
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String x[]) {
        // Definición/creación del objeto
        // nombre_clase nombre_objeto;
        Alumno alum1, alum2;
        
        // Inicializar el objeto (darle un espacio en memoria)
        // Opcionalmente darle valores iniciales
        //alum1 = null;  // Es nada (no tiene espacio en memoria)
        
        // Asignar espacio de memoria para alum1 y de paso 
        // poner valores iniciales
        alum1 = new Alumno(4444, "ABAD", "ANA", 1); 
        alum2 = new Alumno(); // usa el constructor vacío
        // recien se puede usar el objeto alum1
        
        
        // Mostramos los datos de alum1
        alum1.mostrarCarnet();
        
        // ... mucho después se asignan valores a alum2
        alum2.registrarAlumno(12345, "Tello", "Angie", 4);
        alum2.mostrarCarnet();
        
        /*
        ///// Probar Curso
        System.out.println("----------------------------");
        Curso cur1 = new Curso(); // Crea e inicializa el objeto
        
        cur1.registrarCurso(5555, "Java Programación", "05/01/2025");
        cur1.mostrar();
        cur1.modificarFechaInicio("01/02/2025");
        cur1.mostrar();
        cur1.nombre = "Excel Avanzado";
        System.out.println(cur1.nombre); // acceso directo, porque es público
        */
    }
}
