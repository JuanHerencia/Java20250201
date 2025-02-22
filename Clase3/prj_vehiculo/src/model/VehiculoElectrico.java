package model;
import interfaz.*;
/**
 *
 * @author Alumno
 */
public class VehiculoElectrico implements Electrico  {
    
    @Override
    public void motorElectrico() {
        System.out.println("Se ha implementado el motor eléctrico");
    }
}
