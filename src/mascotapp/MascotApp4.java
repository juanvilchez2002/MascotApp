/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotapp;

import servicios.ServicioMascota4;

/**
 *
 * @author JUAN VILCHEZ
 */
public class MascotApp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos e instanciamos el OBJ de tipo ServicioMascota4
        ServicioMascota4 sm4 = new ServicioMascota4();
        
        //creamos por defecto una cantidad de mascotas con valores definidos
        sm4.fabricaMascotasUnicas(10);
        sm4.mostrarMascotas();
        
        System.out.println("");
        
        //creamos una cantidad de mascotas para introducirla por teclado
        sm4.fabricaMascotas(2);
        sm4.mostrarMascotas();
    }
    
}
