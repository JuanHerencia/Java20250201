package controller;

/**
 *
 * @author Alumno
 */
public class Participacion {

    public static void main(String[] args) {
        float califFinal = 25.8f;

        if (califFinal >= 0 && califFinal <= 20) {
            if (califFinal >= 14) {
                System.out.println("APROBADO con " + califFinal);
            } else if (califFinal > 10 && califFinal < 14) {
                System.out.println("PARA SUSTITUTORIO");
            } else {
                System.out.println("DESAPROBADO con " + califFinal);
            }
        } else {
            System.out.println("CALIFICACION INVALIDA");
        }
    }
}
