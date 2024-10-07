
package clase.java.pkg3;


public class ClaseJava3 {

 
    public static void main(String[] args) {
 
        
        
        //El if else es igual que en C.
        int i = 19;
        int r = 20;
        
        if (i > r){
            System.out.println("i es mayor que r.");
        }else{
             System.out.println("i es menor que r.");
        }
        
        System.out.println();
        
        
        //El switch es igual que en C.
        char c = 'a';
        
        switch(c){
        
            
            case 'a':
                System.out.println("Es la letra a.");
                break;
                
                       
            case 'b':
                System.out.println("Es la letra b.");
                break;
                
                
                       
            case 'c':
                System.out.println("Es la letra c.");
                break;
                
                
                
            default:
                System.out.println("No es ni a, ni b, ni c");
                break;   
    }
        
        
        System.out.println("\n");
        
        
        //El while es igual que en C.
        int h = 0;
        
        while (h < 11) {
          System.out.println(h);
          h++;
        }
        
        
        System.out.println("\n");
        
        
          
        //El for es igual que en C.
        int k;
        
        for (k = 0;k<10;k++){
              System.out.println(k);
        }
        
           
        System.out.println("\n");
        
        
        for (int l = 0; l < 10; l++) {
            
        if (l == 4) {
          break; //Deja de ejecutar codigo
        }
        System.out.println(l);
      }
        
           
        System.out.println("\n");
        
        
          for (int l = 0; l < 10; l++) {
            
        if (l == 4) {
          continue; //Pega un salto
        }
        System.out.println(l);
      }
          
          
          
         System.out.println("\n");
          
         
         
       //Arrays 
       
       
       String[] coches; //String vacio
       
       
       
       String[] motos =  {"Yamaha", "Honda", "Suzuki", "Kawasaki", "Ducati"}; //String con contenido establecido
       
       motos[0] = "BMW";
       
       System.out.println(motos[0]);
       
        System.out.println();
      
       for (i = 0; i < motos.length; i++) {
        System.out.println(motos[i]);
    }
       
       
 
        System.out.println("\nEl tamano de motos es: " + motos.length); 
          
    }
    
}
