
package menu;

import java.util.Scanner;



public class Menu {

   
    public int menu(){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n****MENU****:");
        System.out.println("1. Opcion 1.");
        System.out.println("2. Opcion 2.");
        System.out.println("3. Opcion 3.");
        System.out.println("4. Salir.");
        
        System.out.print("\nIntroduce una opcion: ");
        int opcion = sc.nextInt();
        
        return opcion;
    }
    
    
    
    public static void main(String[] args) {

       Menu obj = new Menu();
       
       for(;;){ 
       
           int opcion =  obj.menu();
           
           switch(opcion){
           
                case 1:
                    
                    System.out.println("Has seleccionado la Opcion 1.");
                   
                    break;
                    
                case 2:
                    
                    System.out.println("Has seleccionado la Opcion 2.");
                    
                    break;
                case 3:
                    
                    
                    System.out.println("Has seleccionado la Opcion 3.");
                    
                    break;
                    
                case 4:
                    
                    
                    System.out.println("Saliendo...");
                    
                    return;
                    
                default:
                    
                    System.out.println("Opcion no valida. Por favor, elige una opcion correcta.");  
           }
        }
      
       
    }
        
}
    

