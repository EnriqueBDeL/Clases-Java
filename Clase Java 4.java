package clase.java.pkg4;

public class ClaseJava4 {

    
       //Method
    
       //Solo se pueden declarar dentro de una clase.
    
    static void method(){
        
        System.out.println("\nEsto es un metodo.");
    }
    
//-----------------------------------------------------------------------------   
    static void method2(String nombre, int edad){
        
        System.out.println("\nMi nombre es " + nombre + ".");
         System.out.println("\nTengo "+ edad + " anos.");
    }
    
//-----------------------------------------------------------------------------
       
    
    static int method3(int x, int y) {
        
        return x + y; //10 + 5
    }
    
//----------------------------------------------------------------------------- 
    
    static float method4(float x, float y) {
        
        return x + y; 
    }
    
//----------------------------------------------------------------------------- 
    
    static double method5(double x, double y) {
        
        return x + y; 
    }
    
    
//-----------------------------------------------------------------------------
    
    public static void main(String[] args) {
        
        method(); //con esto llamas al  method.
        
        method2("Enrique",20);
        
        System.out.println("\n10 + 5 =" + method3(10, 5));
        
        System.out.println("Precio: " + method4(23.4f, 20.2f) + " euros");
        
        System.out.println("Precio2: " + method5(10.23, 5.4)+ " euros");
      
        
    }

}
