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
public class ServicioMascota5 {
  //atributos globales
    private Scanner consola;
    //creamos un ArrayLis de tipo objeto Mascota
    private ArrayList<Mascota> mascotas;
    
    //inicializando mascotas atravez del constructor
    public ServicioMascota5(){
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
        
        //devolvemos el OBJ de tipo Mascota creada
        return m;
    }
    
    //metodo que nos adiciona un OBJ de tipo Mascota al ArrayList de tipo Mascota
    public void cargarMascota(Mascota m){
        mascotas.add(m);
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
            cargarMascota(mas);          
        }
    }
    
    //TODO falta añadir el Try Catch, ya que aun no se toca el tema
    //actualizaremos el atributo Apodo del OBJ Mascota, para ello solicitamos
    //el index para recuperar el registro del ArrayList de tipo Mascota
    public void actualizarApodoMascota(int index){
        //verificamos si el indice existe
        if(index <= (mascotas.size()-1)){
            //recuperamos todo el registro de la ubicación index
            Mascota m = mascotas.get(index);
            //modificamos el atributo
            m.setApodo("Luisito Comunica");
        }else{
            System.out.println("Error: Falla al actualizar x error del indice");
        }
    }
    
    //el metodo reemplaza todos los valores del atributo del registro Index
    public void actualizarMascota(int index){
        
        //verificamos si el indice existe
        if(index <= (mascotas.size()-1)){
            //creo un OBJ de tipo Mascota
            Mascota m = crearMascota();
        
            //con el Index actualizo todo los registros de la ubicación dada
            mascotas.set(index, m);
        }else{
            System.out.println("Error: Falla al actualizar x error del indice");
        }
    }
    
    //metodo para eliminar un registro del ArrayList con el indice
    public void eliminarMascota(int index){
        //verificamos si el indice existe
        if(index <= (mascotas.size()-1)){
            //eliminamos el registro del indice enviado
            mascotas.remove(index);
        }else{
            System.out.println("Error: Falla al eliminar el registro");
        }
    }
    
    //metodo para eliminar mascota por nombre
    public void eliminarMascotaPorNombre(String nombre){
    
        for(int i=0; i<mascotas.size(); i++){
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombre)){
                System.out.println("Eliminando mascota con nombre: "+nombre);
                mascotas.remove(i);
            }
        }
    
    }
}