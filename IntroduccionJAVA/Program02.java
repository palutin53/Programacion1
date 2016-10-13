/**
 * En esta aplicación se muestra como abreviar o simplificar
 * el método "print" de la clase "System" por medio de un 
 * método estático que recibe un parámetro de tipo String.
 * 
 * @author Allan Ruíz
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */

public class Program02{
    public static void main(String[] args){
        // Llamada del método dentro de main
        println("Texto numero 2");
        print("Utilizando el método abreviado para imprimir en pantalla.");
    }
    
    // Declaración de print
    public static void print(String s){
        System.out.print(s);
    }
    
    public static void println(String s){
        System.out.println(s);
    }
}