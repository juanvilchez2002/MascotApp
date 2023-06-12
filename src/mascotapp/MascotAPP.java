
package mascotapp;

import entidades.Mascota;
import servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {
        
        ServicioMascota sm = new ServicioMascota();
        
        // creando el objeto m1 
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());
        
        // ejemplo pasaje referencia y valor
        int a=100;
        Mascota mm = new Mascota();
        
        modificador(a, mm);
        
        System.out.println("a: "+a);
        System.out.println("Mascota: "+mm);
    }
    
    public static void modificador(int num, Mascota m){
        num = 10;
        m.setApodo("Mascota Referencia");
    }
    
}
