package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class Test2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("12345678", "Miguel Angel");
        Persona p2 = new Persona("10203040", "Ana Maria");
        
        // EquipoFutbol (1)->(*) Persona
        EquipoFutbol eq = new EquipoFutbol("Boca Junior");
        // Registrar jugadores
        eq.addJugador(p1);
        eq.addJugador(p2);
        eq.addJugador(new Persona("55554444", "ABEL"));
        eq.addJugador(new Persona("11114444", "ANDRES"));
        // Mostrar a los jugadores
        System.out.println(eq);
        eq.mostrarJugadores();
    }
}
