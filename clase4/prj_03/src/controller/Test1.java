package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class Test1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("12345678", "Miguel Angel");
        Persona p2 = new Persona("10203040", "Ana Maria");
        // Pasaporte (1)->(1) Persona // Pasaporte tiene Persona
        Pasaporte pass1 = new Pasaporte("0012345678", p1);
        System.out.println(pass1);
    }
}
