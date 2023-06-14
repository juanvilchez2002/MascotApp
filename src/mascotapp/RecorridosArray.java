/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUAN VILCHEZ
 */
public class RecorridosArray {


    public static void main(String[] args) {
        //creamos una Lista de tipo String
        List<String> nombres = new ArrayList();
        
        //adicionamos valores
        nombres.add("Julio");
        nombres.add("Daniel");
        nombres.add("Loro");
        
        System.out.println("-------- recorrido con for mejorado -------");
        //recorremos y vemos los valors con for mejorado
        for(String aux: nombres){
            System.out.println(aux);
        }        
        
        System.out.println("");
        System.out.println("-------- recorrido con for normal -------");
        for (int i = 0; i < nombres.size(); i++) {            
            System.out.println(nombres.get(i));
        }
        
        System.out.println("");
        System.out.println("-------- recorrido con forEach -------");
        nombres.forEach((nombre)->System.out.println(nombre));

        System.out.println("");
        System.out.println("-------- eliminando un elemento -------");   
        for(int i=0; i<nombres.size(); i++){
            String nombre=nombres.get(i);
            if(nombre.equals("Julio")){
                nombres.remove(nombre);
            }
        }
        
        System.out.println("");
        System.out.println("-------- recorrido de nombres -------");
        nombres.forEach((nombre)->System.out.println(nombre));
        
    }
    
}
