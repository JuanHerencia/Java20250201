package model; // indicación que esta clase está en el paquete model
/**
 * Write a description of class Alumno here.
 * 
 * @author Juan Herencia
 * @version 1.0
 */
public class Alumno
{
    // atributos con acceso private
    private int cod_alum; 
    private String apellidos;
    private String nombres;
    private String DNI;
    private String especialidad;
    private String fec_nacim;
    private String fec_inscrip;
    private int año_estudios;
    
    // Constructores - Inicializadores de los objetos o instancias
    public Alumno(int cod, String ape, String nom, 
                                int año_est) {
        cod_alum = cod;
        apellidos = ape;
        nombres = nom;
        año_estudios = año_est;
    }
    
    // Sobre carga del constructor para usar sin valores
    public Alumno() {
        cod_alum = 0;
        apellidos = "";
        nombres = "";
        año_estudios = -1;
    }
    
    
    // metodos/operaciones
    public void registrarAlumno(int cod, String ape, String nom, 
                                int año_est) {
        cod_alum = cod;
        apellidos = ape;
        nombres = nom;
        año_estudios = año_est;
    }
    
    public int obtenerAñoEstudios() {
        return año_estudios;
    }
    
    public void mostrarCarnet() {
        System.out.println("-----------------------------");
        System.out.println("Código          :" + cod_alum);
        System.out.println("Apellidos       :" + apellidos);
        System.out.println("Nombres         :" + nombres);
        System.out.println("Año de estudios :" + año_estudios);
    }
    
    
}
