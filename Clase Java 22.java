//--------------------------------------------------------------|
//CONTENIDO: Java Swing 
//--------------------------------------------------------------|
package ClaseJava;

//-----------------------------------------|
import javax.swing.JFrame;
//-----------------------------------------|

//-----------------------------------------|
import javax.swing.JPanel;
//-----------------------------------------|


public class ClaseJava22 extends JFrame {

   public ClaseJava22(){
       
    JFrame jf = new JFrame ("Clase Java 22"); //Creamos el marco
     
    JPanel jp = new JPanel(); //Creamos el lienzo (panel)
    
    
    
    jf.setContentPane(jp); //Ponemos el lienzo en el marco
    
    jf.setSize(300,200); //Establecemos el tamaño del marco
    
    
    
    jf.setLocationRelativeTo(null); //Centramos la ventana en la pantalla
    
   
    
    
    jf.setVisible(true); //Hacemos visible la ventana
       //setVisible(false)-> Oculta el componente, pero sigue existiendo en memoria.
   }
   
   
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
    
    public static void main(String[] args) {
        
        ClaseJava22 aplicacion = new ClaseJava22(); //Mostrar ventana
        
    }
    
}
