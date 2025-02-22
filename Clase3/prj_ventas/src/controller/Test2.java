package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class Test2 {
    public static void main(String[] args) {
        Cliente cli1;  // instancia de Cliente
        
        cli1 = new ClienteNatural("10203040", "ABEL ABAD", 2000);
        
        // Determinar el tipo de cliente que es cli1
        if(cli1 instanceof ClienteJuridico) {
            System.out.println("cli1 es un tipo de ClienteJuridico");
        } else {
            System.out.println("cli1 es un tipo de ClienteNatural");
        }
        
    }
}
