package model;

import java.util.Objects;

/**
 *
 * @author Alumno
 */
public class Producto {
    // atributos
    private int cod_prod;
    private String nombre;
    private double precio;
    private int stock;
    
    // constructores
    public Producto(int cod, String nombre, double precio, int stock) {
        if(cod != 0) {
            cod_prod = cod;
        } else {
            System.out.println("El código no puede ser cero");
        }
        
        this.nombre = nombre; // this es una referencia a la clase en curso
        if(precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo o cero");
            this.precio = 0;  
        }
        this.stock = stock;
    }
    
    // sobre carga
    public Producto(int cod, String nombre) {
        cod_prod = cod;
        this.nombre = nombre; // this es una referencia a la clase en curso
        this.precio = 0.0;    // inicializar el resto de atributos
        this.stock = 0;
    }
    
    // constructor vacío
    public Producto() {
        cod_prod = 0;
        this.nombre = "SIN NOMBRE"; // this es una referencia a la clase en curso
        this.precio = 0.0;    // inicializar el resto de atributos
        this.stock = 0;
    }
    
    public boolean EsVendible() {
        boolean esVendible = true;
        if(cod_prod == 0 || nombre.equals("SIN NOMBRE")
                         || stock == 0 || precio == 0) {
            esVendible = false;
        }
        return esVendible;
    }

    // Método para obtener (get) el código del producto
    public int getCod_prod() {
        return cod_prod;
    }

    // Método para guardar/asignar (set) el código del producto
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    // Para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Para poner el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_prod=" + cod_prod + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.cod_prod;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.cod_prod != other.cod_prod) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
}
