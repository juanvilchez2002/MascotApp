
package servicios;

import entidades.Mascota;
import java.util.Scanner;

public class ServicioMascota {
    
    private Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        
        System.out.println("Introducir Nombre: ");
        String nombre = consola.nextLine();
        
        System.out.println("Introducir Apodo: ");
        String apodo = consola.nextLine();
        
        System.out.println("Introducir Tipo: ");
        String tipo = consola.nextLine();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
}
