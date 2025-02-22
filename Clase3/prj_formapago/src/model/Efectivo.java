package model;

/**
 *
 * @author Alumno
 */
public class Efectivo extends FormaPago {
    private String tipoMoneda; // soles o d�lares
    
    public Efectivo(double monto) {
        super("Pago en efectivo");
        tipoMoneda = "Soles";
        this.monto = monto;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
