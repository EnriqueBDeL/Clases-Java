
package clase.java.pkg23;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ClaseJava23 {

    public ClaseJava23(){
    
    JFrame jf = new JFrame ("Clase Java 23");     
    
    JPanel jp = new JPanel(); 
    
    jf.setContentPane(jp);
    jf.setSize(300,200);
    jf.setLocationRelativeTo(null);
    
  
    jp.setBackground(Color.blue); //Cambia color del panel.
    
    
    
    jp.setLayout(new FlowLayout()); //"FlowLayout" va colocando los componentes dentro del panel de izquierda a derecha en el orden en que se agregan.

    
    
    JButton jb = new JButton("Botón 1"); //Crea un botón.
    jp.add(jb); //Añade el botón al panel.
    JButton jb2 = new JButton("Botón 2");
    jp.add(jb2); 
    JButton jb3 = new JButton("Botón 3");
    jp.add(jb3);
    
    jf.setVisible(true);
    }
 
    public static void main(String[] args) {
       
        ClaseJava23 aplicacion  = new ClaseJava23();
    }
    
}
