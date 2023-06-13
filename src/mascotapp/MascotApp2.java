
package mascotapp;


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
    }
    
}
