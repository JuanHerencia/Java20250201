package model;

/**
 *
 * @author Alumno
 */
public class Boleto {
    private int cod_boleto;
    private String origen;
    private String destino;
    private static int contador = 0; // esta variable es única
                                     // para todas las instancias
                                     // de boleto

    public Boleto(String origen, String destino) {
        this.contador++;
        this.cod_boleto = this.contador;
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Boleto{" + "cod_boleto=" + cod_boleto + ", origen=" + origen + ", destino=" + destino + '}';
    }
    
    
}
