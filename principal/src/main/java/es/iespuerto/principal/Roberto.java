package es.iespuerto.principal;


public class Roberto 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    String nombre;
    String apellido1;
    String apellido2;
    /**
     * Constructor por defecto
     */
    public Roberto() {
    }
     /**
      * Constructor con un parametro
      * @param nombre
      */
    public Roberto(String nombre) {
        this.nombre = nombre;

    }
    /**
     * Constructor con dos parametros 
     * @param nombre parametro 1
     * @param apellido1 parametro 2
     */
    public Roberto(String nombre, String apellido1) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
    
    }
    /**
     * Constructor con tres parametros 
     * @param nombre Parametro 1 del Constructor 
     * @param apellido1 Parametro 2 del constructor
     * @param apellido2 Parametro 3 del constructor 
     */
    public Roberto(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    /**
     * Metodo Validar nombre sin parametros 
     */
    public void validarNombre(){

    }


    

}
