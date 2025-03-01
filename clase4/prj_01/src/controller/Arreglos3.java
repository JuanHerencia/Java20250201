package controller;

/**
 *
 * @author Alumno
 */
public class Arreglos3 {
    public static void main(String[] args) {
        // Crear un objeto de Automovil
        model.Automovil veh1 = new model.Automovil("ABC100", "KIA", 2005);
        System.out.println(veh1);
        
        // Crear un arreglo de Automoviles
        int cantidad = 5;
        model.Automovil vehs[]; // definir el arreglo
        
        // Indicar la cantidad de vehiculos
        vehs = new model.Automovil[cantidad];
        
        //inicializarlos con null
        for(int i = 0; i < cantidad; i++) {
            vehs[i] = null;
        }
        
        // Mucho mas adelante se pueden usar
        
        // Asignando valor al elemento de índice 3 y 1
        vehs[3] = new model.Automovil("WXZ222", "VOLVO", 2020);
        vehs[1] = new model.Automovil("ABX", "NISSAN", 2015);
        
        // mostrarlos
        System.out.println("Lista de vehículos");
        for(int i = 0; i < cantidad; i++) {
            if(vehs[i] != null) {
               System.out.println(vehs[i]);
            }
        }
        
        
    }
}
