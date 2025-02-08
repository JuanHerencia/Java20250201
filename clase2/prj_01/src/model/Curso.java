// Al inicio del archivo se pone el paquete corresponidnte
package model;
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    private int cod_curso;
    public String nombre;
    private String fec_inicio;
    
    public void registrarCurso(int cod, String nom, String fec) {
        cod_curso = cod;
        nombre = nom;
        fec_inicio = fec;
    }
    
    public void mostrar() {
        System.out.println("Código          : " + cod_curso);
        System.out.println("Nombre          : " + nombre);
        System.out.println("Fecha de inicio : " + fec_inicio);
    }
    
    public void modificarFechaInicio(String nuevaFecha) {
        fec_inicio = nuevaFecha;
    }
}
