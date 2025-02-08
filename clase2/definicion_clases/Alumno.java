
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
        System.out.println("Código          :" + cod_alum);
        System.out.println("Apellidos       :" + apellidos);
        System.out.println("Nombres         :" + nombres);
        System.out.println("Año de estudios :" + año_estudios);
    }
    
    
}
