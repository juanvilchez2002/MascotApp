/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioMascota4 {
    //atributos globales
    private Scanner consola;
    //creamos un ArrayLis de tipo objeto Mascota
    private ArrayList<Mascota> mascotas;
    
    //inicializando mascotas atravez del constructor
    public ServicioMascota4(){
        this.consola = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    //se crea un metodo para crear la mascota
    public Mascota crearMascota(){
        
        System.out.println("Introducir Nombre: ");
        String nombre = consola.nextLine();
        
        System.out.println("Introducir Apodo: ");
        String apodo = consola.nextLine();
        
        System.out.println("Introducir Tipo: ");
        String tipo = consola.nextLine();
        
        //creamos un OBJ de tipo Mascota y lo pasamos por el constructor
        Mascota m = new Mascota(nombre, apodo, tipo);        
        
        //adicionamos el OBJ al ArrayList
        mascotas.add(m); 
        
        return m;
    }
    
    //metodo que usaremos para mostrar los valores del ArrayList mascotas
    public void mostrarMascotas(){
    
        System.out.println("Los nombres del ArrayList mascotas");
        //cambiamos el tipo de variable de String al tipo OBJ Mascota
        for(Mascota aux: mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("La cantidad de mascotas es: "+mascotas.size());
    }
    
    /**
     * 
     * @param cantidad es la cantidad de mascotas a fabricar
     */
    public void fabricaMascotasUnicas(int cantidad){
        for(int i=0; i<cantidad; i++){
            mascotas.add(new Mascota("Peluchin", "Peluche", "Perro"));
        }
    }
    
    /**
     * aquí crearemos las mascotas por consola
     * @param cantidad 
     */
    public void fabricaMascotas(int cantidad){
        for(int i=0; i<cantidad; i++){
            Mascota mas = crearMascota();
            System.out.println(mas.toString());
            
            //no adicionamos aquí al ArrayList xq en crearMascota() se 
            //adiciona y se duplicaria el registro
            //mascotas.add(mas);
        }
        
    }
}