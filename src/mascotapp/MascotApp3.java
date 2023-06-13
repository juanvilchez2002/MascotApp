
package mascotapp;

import servicios.ServicioMascota3;

public class MascotApp3 {


    public static void main(String[] args) {
        
        ServicioMascota3 sm3 = new ServicioMascota3();
        
        //ingresamos dos valores al ArrayList
        sm3.crearMascota();
        sm3.crearMascota();
        
        //mostramos los valores guardaos
        sm3.mostrarMascotas();
        
    }
    
}
