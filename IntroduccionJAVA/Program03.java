/**
 * Esta aplicación ejemplifican qué son y cómo
 * se usan las secuencias de escape dentro métodos
 * de impresión u objetos que trabajan con cadenas
 * de texto (Strings).
 * 
 * @author Allan Ruíz
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */

public class Program03{
    public static void main(String[] args){
        print("<< SECUENCIAS DE ESCAPE EN JAVA >>");
        print("\n----------------------------------------\n");
        print("n \t Nueva línea\n");
        print("t \t Tabulación\n");
        print("r \t Retorno, sobreescribe los caracteres previos\n");
        print("b \t Borrar, borra los caracteres previos\n");
        print("\\\t Caracter diagonal inversa\n");
        print("\"\t Comillas dobles\n");
        print("\'\t Comillas simples\n");
    }
    
    public static void print(String s){
        System.out.print(s);
    }
}
