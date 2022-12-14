/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author jhoan
 */
public class ejercicio4_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var estacion="INVIERNO";
        switch (estacion) {
            case "VERANO":
                                 System.out.println("estas en verano");
                break;
             case "PRIMAVERA":
                                 System.out.println("estas en primavera");
                break;
             case "OTOÑO":
                                 System.out.println("estas en otoño");
                break;
             case "INVIERNO":
                 System.out.println("estas en invierno");
                break;   
            default:
                System.out.println("Error no es una estacion del año");
        }
    }
    
}
