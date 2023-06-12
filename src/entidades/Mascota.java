
package entidades;

public class Mascota {
    
    // atributos
    private String nombre;
    private String apodo;
    
    //conejo, gato, perro , loro, carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    private int energia;
    
    // constructor vacio
    public Mascota(){
        energia = 1000;
    }
    
    // constructor no vacio
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")){
              this.tipo = tipo;          
        }
        
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    
    
    // encapsulamiento - permite una accesibilidad controlada a modificar o cambiar
    // atributos de un objeto, tmb permite acceder a metodos espeficicos que se
    // considere pertinente
    
    // setter - nos permite cambiar un valor de un atributo
    public void setNombre(String nombre){
        // los setter's tmb pueden contener logica
        if(nombre.length()>0){
            this.nombre = nombre;
        }
    }
    
    // getter - nos permite traer el atributo entrando a la misma clase
    public String getNombre(){
        return this.nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    // sobre cargamos el metodo pasear, pero estas reciben diferentes argumentos
    /**
     * funcion para paseae
     * 
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        energia-=energiaRestar;
        return energia;
    }
    
    /**
     * 
     * funcion para pasear con vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        
        for(int i=0; i<vueltas; i++){
            energia-=energiaRestar;
        }
        
        return energia;
    }
    
    // toString - devuelve un mensaje
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
}
