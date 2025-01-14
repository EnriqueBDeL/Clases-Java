
package matrizvsarraylist;


 import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;



public class MatrizvsArrayList {

    static String[] coches2 = new String[100];    
    
    static ArrayList<String> coches = new ArrayList<String>();

    static LinkedList<String> coches3 = new LinkedList<String>();
    
    static HashMap<String,String> modelos = new HashMap<String,String>();
    
    
public static void main(String[] args) {

//Array     
        
        
            Scanner sc2 = new Scanner(System.in);

            System.out.println("ALMACENAR EN ARRAY:");
            
            int i = 0;
            
        for(;;){
            
            System.out.print("Introduce el nombre del modelo: ");
            String modelo2 = sc2.nextLine();
        
            if(modelo2.equals("Salir") || modelo2.equals("salir") ){
            
                break;
            
            }else{
                
            coches2[i] = modelo2;
            System.out.println("Modelos intorducido: "+ coches2[i]);
            
             i++;
            }
            
            
 
        }
        
              System.out.println("\nCoches guardados en el Array:");
            for(int j = 0; j < i; j++){
                System.out.println((j + 1) + ". " + coches2[j]);
            }
            
            
         System.out.println("\n");
        
//-----------------------------------------------------------------------------|
//ArrayList      
        
            Scanner sc = new Scanner(System.in);

            System.out.println("ALMACENAR EN ARRAYLIST:");
            
        for(;;){
            
            System.out.print("Introduce el nombre del modelo: ");
            String modelo = sc.nextLine();

            if(modelo.equals("Salir") || modelo.equals("salir") ){
            
                break;
            
            }else{
                
            coches.add(modelo);
            
            System.out.println("Modelo insertado: " + modelo);
            
            }
            
        
            
         
        }
        
            System.out.println("\nCoches guardados en el ArrayList:");
            int contador = 1;
            
            for (String coche : coches) {
                System.out.println(contador +". "+coche); 
                contador++;
            }
            
                 System.out.println("\n");
            
//-----------------------------------------------------------------------------|
//LinkedList   
        
         Scanner sc3 = new Scanner(System.in);

            System.out.println("ALMACENAR EN LINKEDLIST:");
            
            for(;;){
            
            System.out.print("Introduce el nombre del modelo: ");
            String modelo3 = sc3.nextLine();
            
            if(modelo3.equals("Salir") || modelo3.equals("salir") ){
            
                break;
            
            }else{
                
            coches.add(modelo3);
            
            System.out.println("Modelo insertado: " + modelo3);
            
            }
         
            }
            
             for (String coche : coches) {
                System.out.println(contador +". "+coche); 
                contador++;
            }
             
                  System.out.println("\n");
            
//-----------------------------------------------------------------------------|
//HashMap                   
                  
             
        Scanner sc4 = new Scanner(System.in);          
                  
        System.out.println("ALMACENAR EN HASHMAP:");
            
        for(;;){
            
            System.out.print("Introduce el ID del modelo: ");
            String intro = sc4.nextLine();  
            
             if(intro.equals("Salir") || intro.equals("salir") ){
            
                break;
            
            }
            System.out.print("Introduce el nombre del modelo: ");
            String intro2 = sc4.nextLine();  
                  
         
            modelos.put(intro,intro2);
            
            System.out.println("ID: " + intro + "| Modelo insertado: " + intro2);
            
            
         
        }          
                  
            System.out.println("\nCoches guardados en el HashMap:");
            int contador2 = 1;
            
           for (String id : modelos.keySet()) {
            String modelo = modelos.get(id);
            System.out.println(contador2 + ". ID: " + id + " | Modelo: " + modelo);
            contador2++;
        }
            
                 System.out.println("\n");                  
                  
    }

}
    

