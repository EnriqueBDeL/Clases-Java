
package clase.java.pkg2;


public class ClaseJava2 {

    
    public static void main(String[] args) {

       
        // En java puedes cambiar el tipo de variable de la siguiente manera:
        
        int i = 4;
        double d = i;
        float f = i;
        
           System.out.println(i);
           System.out.println(d);
           System.out.println(f);
           
           
                System.out.println(); // esto es lo mismo que escribir ...print("\n");
           
                
        double d1 = 10;
        int i1 = (int) d1;
        float f1 = (float) d1;
        
            System.out.println(d1);   
            System.out.println(i1);
            System.out.println(f1);
      
            
                System.out.println();
              
    
         float f2 = 20.20f;
         int i2 = (int)f2;
         double d2 = (float) f2;
        
            System.out.println(f2);
            System.out.println(i2);
            System.out.println(d2);   // Como float tiene menos precision que el double, se le añaden unos decimales extra.)
            
            
              System.out.println();
  
                
         // Obtener el tamaño de un String.     
         String saludo = "Hola Mundo!";   
         System.out.println("El tamano del saludo es: " + saludo.length());
         
         
             System.out.println();
  
         
        // Cambio de formato.
        
        System.out.println(saludo.toUpperCase());   // Mayusculas 
        System.out.println(saludo.toLowerCase());   // Minusculas
        
        
            System.out.println();
        
            
        // Localizar una palabra en un String.
        
        String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.";
        
        System.out.println("Hasta la palabra tiempo hay: " + frase.indexOf("tiempo") + " caracteres"); //Cuenta el numero de caracteres que hay hasta la palabra que has elegido.
        
        
            System.out.println();
        
        //Formas de unir dos Strings.
        
        String nombre = "Pepe";
        String apellido = "Lopez";
        
        System.out.println(nombre + " " + apellido);
        
        
        
        String nombre2 = "Maria ";
        String apellido2 = "Suarez";
        
        System.out.println(nombre2.concat(apellido2));
        
        
              System.out.println();

              
        // Caracteres especiales:
        
        // Comilla simple '.
        String texto1 = "Hola, si te ha gustado el tutorial, dejame una \'estrella\'.";
        
        System.out.println(texto1);
        
        // Comilla doble ".
        String texto2 = "Hola, si te ha gustado el tutorial, dejame una \"estrella\".";
        
        System.out.println(texto2);
        
        // Barra invertida
        String texto3 = "Hola, si te ha gustado el tutorial, dejame una \\estrella\\.";
        
        System.out.println(texto3);
        
        
              System.out.println();
              
              
        // Sentencias especiales:
        
           System.out.println("Hola\nMundo  "); //  Salto de línea
           
                   System.out.println();
           
           System.out.println("Hola\rMundo  "); // Regresa el cursor al inicio de la línea actual y sobreescribe lo que está después de él.
           
                   System.out.println();
           
           System.out.println("Hola\tMundo  "); //  Inserta una tabulación.
           
                   System.out.println();
           
           System.out.println("Hola\bMundo  "); //  Inserta un retroceso. El carácter antes de \b se borrará.
           
                   System.out.println();
           
           System.out.println("Hola\fMundo  "); //  Inserta un salto de página
           
                   System.out.println();
              
        
    }
    
}
