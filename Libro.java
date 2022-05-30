/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroApp.entidades;

import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class Libro {
    
    public String titulo;
    public String autor;
    public int ISBN;
    public int npag;
    
    public Libro(){
        
    }
    
    public Libro (String titulo, String autor, int ISBN, int npag){
        this.titulo = titulo;
        this.autor = autor; 
        this.ISBN = ISBN;
        this.npag = npag;
    }
    
    public void mostrar(){
        Scanner sc = new Scanner (System.in);
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresar Titulo del libro");
        titulo = sc.nextLine();
        System.out.println("Ingresar Nombre del Autor del libro");
        autor = leer.nextLine();
        System.out.println("Ingresar codigo ISBN");
        ISBN = sc.nextInt();
        System.out.println("Ingresar numero de paginas del libro");
        npag = sc.nextInt();
    }
    
    public String toString(){
        return "Libro: " + titulo + ". Su autor es " + autor + ". Su ISBN es " + ISBN + ". El numero de paginas es " + npag;
    }
    
}
