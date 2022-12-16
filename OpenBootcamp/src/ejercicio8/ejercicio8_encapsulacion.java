/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author jhoan
 */
public class ejercicio8_encapsulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         persona persona=new persona();
         persona.setedad(15);
         persona.setnombre("juan");
         persona.settelefono("6354565231");
         System.out.println("tu edad es:"+persona.getedad());
         System.out.println("tu numero es es:"+persona.gettelefono());
         System.out.println("tu nombre:"+persona.getnombre());
    }
    
    
}
