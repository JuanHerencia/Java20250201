package model;

/**
 * Clase para gestionar a las personas naturales como clientes 
 * @author Alumno
 */
// ClienteNatural ser� hija de Cliente
// ClienteNatural es subclase de la superclase Cliente
// ClienteNatural proviene de Cliente
public class ClienteNatural extends Cliente {
    private String DNI;

    public ClienteNatural(String DNI,String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
        this.DNI = DNI;
    }
    
    public ClienteNatural(String DNI,String nombre, double capacidad_compra,
            String domicilio, String email, int a�o_inscrip) {
        super(nombre, capacidad_compra, domicilio, email, a�o_inscrip);
        this.DNI = DNI;
    }
    
    // Manipular� a�o_inscrip
    public int getAntiguedad() {
        // a�o actual - a�o_inscrip
        // El acceso a a�o_inscrip desde esta clase es
        // porque en la clase padre se ha definido con
        // acceso protegido (si fuera privado NO es accesible)
        return 2025 - a�o_inscrip; 
    }

    // Sobre escribe el m�todo toString de la clase padre
    @Override
    public String toString() {
        return "ClienteNatural{" + "DNI=" + DNI + ", " + super.toString() + '}';
    }
    
    
    
}
