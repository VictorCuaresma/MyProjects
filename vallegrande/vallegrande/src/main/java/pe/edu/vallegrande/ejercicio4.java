/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.vallegrande;

import static java.lang.System.console;

/**
 *
 * @author Lab23
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String verdura = "yuca";
                switch(verdura){
                    case "camote":
                    System.out.println("Los camotes cuestan 1.80");
                        break;
                    case "papa":
                    System.out.println("Las papas cuestan 2.00");
                        break;
                    default:
                    System.out.println("No tenemos esa verdura porque esta cara");
                    break;
                }
    }
    
}
