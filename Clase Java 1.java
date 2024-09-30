
// Esto es un comentario.

/*

Esto también es un comentario.

*/


package clase.java.pkg1;


public class ClaseJava1 {

 
    public static void main(String[] args) {
        
        
        System.out.println("Esto es un texto."); //Imprime el texto que hay entre "" y al final da un salto.
        
        System.out.print("\n"); //Al igual que en c, puedes escribir \n para hacer un salto de linea.
         
        System.out.print("Esto es un texto."); //Imprime el texto que hay entre "" sin salto al final.
        System.out.print("Esto es un texto.");
       
        
        System.out.print("\n\n");
         
        
        //De esta manera puedes imprimir numeros.
        
        System.out.println("1");
        System.out.print("2");
        
        System.out.print("\n");
         
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        
        
        System.out.print("\n");
        
        //Tambien puedes hacer calculos e imprimirlos.
        
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(2 * 2);
        System.out.println(4 / 2);
        System.out.println(4 % 2);
        
        //Tambien puedes hacer operaciones con numeros negativos.
        System.out.println(1 - 4);

        
        
        System.out.print("\n");
        
        
        
        //Variables en Java.
        
        int n;
        float f;
        char c;
        boolean b; 
        double d;
        String s;
         
         
        n = 10;
        f = 4.34f;   //Si no pones la f al final, el sistema dará error, ya que se piensa que es un double.
        c = 'a';
        b = true;     //Tienen que ser true o false.
        d = 19.99d;      //La d es recomendada ponerla. Si no la pones, funcionará igual que si la tubiera.
        s = "PEPE";
         
        
        System.out.println("El entero n contiene: " + n);
        System.out.println("El flotante f contiene: " + f);
        System.out.println("El caracter c contiene: " + c);
        System.out.println("El booleano b contiene: " + b);
        System.out.println("El dato de doble precision d contiene: " + d);
        System.out.println("La cadena s contiene: " + s);
        
        
        System.out.print("\n");
        
        
        
        
        //Suma de Strings.
          
        String palabra1 = "Hola ";
        String palabra2 = "Mundo.";
        String suma;
        
        //Forma 1
        suma = palabra1 + palabra2;
        System.out.print("Suma contiene: ");
        System.out.println(suma);
        
        //Forma 2
        System.out.print("El resultado de (palabra1 + palabra 2): ");
        System.out.println(palabra1 + palabra2);
        
        
        
        System.out.print("\n");
        
        
        
        
        //Calculo con variables.
        
        int r = 10;
        int g = 24;
        
        System.out.println(r + g);
        System.out.println(r - g);
        System.out.println(r * g);
        System.out.println(r / g);
        System.out.println(r % g);
        
        System.out.print("\n");
        
        int x, y, z;
        
        x = y = z = 1;
        System.out.println(x + y + z);
        
        System.out.println("Resultado: "+ (x + y + z));
        //Ten cuidado con poner el parentesis porque si no, en vez de hacer la suma, escribira el contenido de las variables.
        System.out.println("Resultado: "+ x + y + z);
    
    }
    
}
