/**
 * Esta aplicación ejemplifica el uso de la palabra "new",
 * su significado, implicaciones y como instancias objetos
 * desde otros.
 * 
 * @author Allan Ruíz
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */

public class Program06{
    public static void main(String[] args){
        // Arreglo de caracteres
        char[] saludo ={'H','O','L','A'};
        String s = new String(saludo); //String s = saludo;
        System.out.print(s);
    }
}