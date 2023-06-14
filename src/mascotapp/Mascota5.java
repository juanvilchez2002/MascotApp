/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotapp;

import servicios.ServicioMascota5;

/**
 *
 * @author JUAN VILCHEZ
 */
public class Mascota5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos e instanciamos el OBJ de tipo ServicioMascota4
        ServicioMascota5 sm5 = new ServicioMascota5();
        
        sm5.fabricaMascotas(2);
        sm5.mostrarMascotas();
        
        System.out.println("----- Actualizamos el Apodo -----");
        sm5.actualizarApodoMascota(0);
        sm5.mostrarMascotas();
        
        System.out.println("----- Actualizamos todos los Atributos -----");
        sm5.actualizarMascota(0);
        sm5.mostrarMascotas();
        
        System.out.println("----- Eliminando un registro -----");
        sm5.eliminarMascota(1);
        sm5.mostrarMascotas();
        
        System.out.println("----- Eliminando una mascota de nombre Juan -----");
        sm5.eliminarMascotaPorNombre("Juan");        
        sm5.mostrarMascotas();

    }
    
}