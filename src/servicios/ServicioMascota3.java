/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JUAN VILCHEZ
 */
public class ServicioMascota3 {
    
    //atributos globales
    private Scanner consola = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<String> mascotas;
    
    //inicializando mascotas atravez del constructor
    public ServicioMascota3(){
        this.mascotas = new ArrayList();
    }
    
    //se crea un metodo para crear la mascota
    public void crearMascota(){
        
        System.out.println("Introducir Nombre: ");
        String nombre = consola.nextLine();
        
        System.out.println("Introducir Apodo: ");
        String apodo = consola.nextLine();
        
        System.out.println("Introducir Tipo: ");
        String tipo = consola.nextLine();
        
        String mascota = nombre+" "+apodo+" "+tipo;
        
        //adicionando al ArrayList mascota los nombres
        mascotas.add(mascota);        
    }
    
    //metodo que usaremos para mostrar los valores del ArrayList mascotas
    public void mostrarMascotas(){
    
        System.out.println("Los nombres del ArrayList mascotas");
        for(String aux: mascotas){
            System.out.println(aux);
        }
        System.out.println("La cantidad de mascotas es: "+mascotas.size());
    }
}
