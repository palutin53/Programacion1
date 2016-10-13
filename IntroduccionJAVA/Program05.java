/**
 * En esta aplicación muestra cómo funciona el 
 * método de impresión por formato, sus parámetros
 * requeridos y cómo combinarlos con secuencias de
 * escape.
 * 
 * @author Allan Ruíz
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */

public class Program05{
    public static void main(String[] args){
        int cantidad = 3;
        float precio = 335.99f;
        char clase='A';
        double total= cantidad * precio;
        
        System.out.printf("%s%c\n","Clase: \t\t\t",clase);
        System.out.printf("%s%d\n","Cantidad de boletos: \t",cantidad);
        System.out.printf("%s%f\n","Precio unitario: \t", precio);
        System.out.printf("%s\n","\t\t\t------------");
        System.out.printf("%s%f","Total:\t\t\t",total);
        
        /*
         * %s - String
         * %d - int
         * %f - float/double
         * %c - character
         */
    }
}
