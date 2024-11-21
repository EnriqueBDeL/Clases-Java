//--------------------------------------------------------------|
//CONTENIDO: subList() y isEmpty()
//--------------------------------------------------------------|
package clase.java.pkg15;


//-----------------------------------------|
import java.util.ArrayList;
//-----------------------------------------|

//-----------------------------------------|
import java.util.List;
//-----------------------------------------|


public class ClaseJava15 {
    
    
    
    
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------| 
    public static void main(String[] args) {
       
    
    // subList()    
        
    ArrayList<String> coches = new ArrayList<String>();  
     
    coches.add("Bugatti"); // 0
    coches.add("Tesla"); // 1
    coches.add("Ford"); // 2
    coches.add("Jeep"); // 3
    
    List<String> sublist = coches.subList(1, 3); //Crea una vista de los elementos entre 1 y 3. Incluyendo 1 y excluyendo 3.
                                                 // En este caso: [ Tesla (1) y Ford (2) ]
  
     System.out.println(sublist);
    
    sublist.set(0, "BMW"); //Modifica el primer elemento de la sublista. A su vez, modifica este coche en la lista principal.
    
    
    System.out.println("\n"+coches);
    
    
    
    //-----------------------------------------------------------------------------------------------------------------------------|
    System.out.println("\n|----------------------------------|\n");//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //-----------------------------------------------------------------------------------------------------------------------------|
    
    
    ArrayList<String> lista = new ArrayList<>(); //Crea la lista vacia.
    
    
    System.out.println("Lista vacia?: " + lista.isEmpty());
    
    //...............................
    
    
    lista.add("Agua"); //Meter elemento en la lista.
     
     
    System.out.println("\nLista vacia?: " + lista.isEmpty()+"\n");
    
    
    
    }
    
}
