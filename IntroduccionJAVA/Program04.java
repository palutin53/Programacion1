/**
 * Este programa permite conocer y comprender como 
 * pasar parámetros al método principal y la estructura
 * del mismo.
 * 
 * @author Allan Ruíz
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */

public class Program04{
    public static void main(String[] args){
        print("Nombres de los " + args.length + " invitados: ");
        for(int i=0;i<args.length;i++){
            print("\n" + args[i]);
        }
    }
    public static void print(String s){
        System.out.print(s);
    }
}
