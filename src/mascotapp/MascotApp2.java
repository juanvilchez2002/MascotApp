
package mascotapp;

import java.util.ArrayList;


public class MascotApp2 {


    public static void main(String[] args) {
        //creando un arreglo de tipo String de forma tradicional
        String[] nombresArray = new String[5];
        
        //adicionando elementos
        for(int i=0; i<nombresArray.length; i++){
            nombresArray[i] = "Chiquito "+(i+1);
        }
        
        //mostrando los nombres
        for(String var: nombresArray){
            System.out.println(var);
        }
        
        //usando Collections
        //el ArrayList se inicializa con dimension cero
        ArrayList<String> nombresArrays = new ArrayList();
        
        //verificando el estado del ArrayList, de dimension 0
        System.out.println(nombresArrays.size());
        
        //adicionando un elemento al ArrayList
        for(int i=0; i<5; i++){
            nombresArrays.add("Chiquito "+(i+1));
        }
                
        System.out.println(nombresArrays.size());
        
        //mostrando los elementos
        for(String var: nombresArrays){
            System.out.println(var);
        }
        
        //eliminando un elemento
        nombresArrays.remove("Chiquito 5");
        
        System.out.println(nombresArrays.size());
        
        //mostrando los elementos
        for(String var: nombresArrays){
            System.out.println(var);
        }
        
    }
    
}
