package model;

/**
 * Clase para gestionar a las personas naturales como clientes 
 * @author Alumno
 */
// ClienteNatural será hija de Cliente
// ClienteNatural es subclase de la superclase Cliente
// ClienteNatural proviene de Cliente
public class ClienteNatural extends Cliente {
    private String DNI;

    public ClienteNatural(String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
    }
    
}
