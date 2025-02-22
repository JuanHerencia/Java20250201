package model;
import interfaz.*;
/**
 *
 * @author Alumno
 */
public class VehiculoHibrido implements Electrico, Combustion{

    @Override
    public void motorElectrico() {
        System.out.println("Tiene motor eléctrico");
    }

    @Override
    public void motorCombustion() {
        System.out.println("Tiene motor a combustión");
    }
    
}
