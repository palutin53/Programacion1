/**
 * Esta aplicación muestra qué es y cómo se desarrollan
 * los Applet dentro de Java.
 * 
 * @author Allan Ruíz
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */

//Importación de librerías para gráficos
import java.awt.*;
import javax.swing.*;

public class Programa08 extends JApplet{ //Ejemplificación herencia
    //Método principal de Applets
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, 600, 800);
        //Configuración primer mensaje
        g.setFont(new Font("Helvetica Nenue",Font.BOLD,40));
        g.setColor(new Color(0,0,0));
        g.drawString("Ejemplo de Applet", 70, 150);
        //Configuración segundo mensaje
        g.setFont(new Font("Times New Roman",Font.BOLD,38));
        g.setColor(new Color(76,76,76));
        g.drawString("utilizando BlueJ", 110, 190);
        //Configuración tercer mensaje
        g.setColor(new Color(140,140,140));
        g.setFont(new Font("Garamond",Font.PLAIN,30));
        g.drawString("para UDEO - PROGRA I", 90, 220);
    }

}