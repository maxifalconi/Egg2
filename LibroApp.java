 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroApp;

import LibroApp.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class LibroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        Libro L1 = new Libro();
        L1.mostrar();
        System.out.println(L1);
        
    }
    
}
