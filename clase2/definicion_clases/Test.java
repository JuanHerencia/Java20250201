
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
        Alumno alum1;
        
        // Inicializar el objeto (darle un espacio en memoria)
        // Opcionalmente darle valores iniciales
        //alum1 = null;  // Es nada (no tiene espacio en memoria)
        
        // ... muchas lineas adelante recien se requiere llenar datos
        alum1 = new Alumno(); // asignar espacio de memoria
        
        // recien se puede usar el objeto alum1
        alum1.registrarAlumno(12345, "Tello", "Angie", 4);
        
        // Mostramos los datos
        alum1.mostrarCarnet();
        
        ///// Probar Curso
        System.out.println("----------------------------");
        Curso cur1 = new Curso(); // Crea e inicializa el objeto
        
        cur1.registrarCurso(5555, "Java Programación", "05/01/2025");
        cur1.mostrar();
        cur1.modificarFechaInicio("01/02/2025");
        cur1.mostrar();
        cur1.nombre = "Excel Avanzado";
        System.out.println(cur1.nombre); // acceso directo, porque es público
        
    }
}
