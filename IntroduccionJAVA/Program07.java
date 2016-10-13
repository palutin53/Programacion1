/**
 * En esta aplicación se muestra cómo se importan las 
 * librerías por medio de dot syntax. También ejemplifica
 * como extendemos funcionalidad por medio de las mismas.
 * 
 * @author Allan Ruíz
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */
import java.util.Properties;

public class Program07{
    public static void main(String[] args){
        print("--- Información del Equipo donde se ejecuta esta aplicación --- \n\n");
        // Obtenemos las propiedades del Sistema
        Properties props = System.getProperties();
        // Información del Sistema Operativo
        print("OS: \t" +  props.get("os.name") + " " + props.get("os.version"));
        // Información de la versión de Java a utilizar
        print("\nJava: \t" + props.get("java.vendor") + " " + props.get("java.version"));
        // Información de classpath de Java
        String classpath = props.get("java.class.path").toString();
        print("\nPath: \t" + classpath);
        
        //Evaluamos IDE
        String ide;
        if(classpath.contains("bluej")){
            ide = "BlueJ";
        }else{
            ide ="Desconocida";
        }
        print("\nIDE: \t" + ide);
        print("\nCode: \t" + ide.hashCode());
    }
    
    public static void print(String s){
        System.out.print(s);
    }
}
