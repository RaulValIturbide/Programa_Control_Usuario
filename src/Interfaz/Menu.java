/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;
import java.util.Scanner;
/**
 *
 * @author raulz
 */
public class Menu {

    static Scanner teclado = new Scanner(System.in);
    /**
     * Este metodo presenta las opciones del menu principal
     * @return devuelve la eleccion del usuario en el menu principal
     */
    public static int introduccion() {
        System.out.println("""
                           �Qu� deseas hacer?
                           1-Alta usuario
                           2-Baja usuario
                           3-Cambiar contrase�a
                           4-Entrar al sitio
                           5-Listado de usuarios
                           0-Salir
                           """);
        int usuario = teclado.nextInt();
        return usuario;
    }
    /**
     * Este metodo pedir� al usuario que nivel de seguridad quiere de 1 a 3
     * @return el nivel de seguridad del 1 al 3
     */
    public static int nivelSeguridad() {
        int nivel = 0;
        System.out.println("�Qu� nivel deseas que sea tu usuario? (1,2 o 3)");
        do {
            nivel = teclado.nextInt();
            if (nivel < 1 || nivel > 3) {
                System.out.println("El nivel debe ser un numero entre 1 y 3");
            }

        } while (nivel < 1 || nivel > 3);

        return nivel;
    }
    /**
     * Este  metodo pide un nombre al usuario 
     * @return Nos devuelve el string nombre
     */
    public static String pedirNombre(){
        System.out.println("Dame un nombre para el usuario:");
        String nombre = teclado.nextLine();
        return nombre;
    }
    
    public static String pedirContra(){
        System.out.println("Dame una contrase�a para tu usuario");
        String contra = teclado.nextLine();
        return contra;
    }
    public static void limpiarBuffer(){
        teclado.nextLine();
    }
    /**
     * Este metodo dar� la informacion al usuario de que se ha repetido nombre y contrase�a y no agregar� el usuario a la lista hasta que cree uno 
     * que no se repita
     * @param numero si el numero recibido es -1 significar� que no hay repetici�n
     */
    public static void usuarioRepetido(int numero){
        if (numero != -1){
            System.out.println("Este usuario ya existe, por favor elija un nombre o contrase�a diferente, gracias");
        }
    }
    /**
     * Un metodo que almacena la info de nombre y contrase�a que el usuario 
     * @return devuelve un array de dos espacios que son el nombre y contrase�a escritas por el usuario
     */
    public static String[] recogerUsuario() {
        String[] aDatos = new String[2];
        System.out.println("nombre del usuario");
        limpiarBuffer();
        aDatos[0] = teclado.nextLine();
        System.out.println("contrase�a del usuario:");
        aDatos[1] = teclado.nextLine();
        
        return aDatos;
    }
    public static String nuevaContra(){
        String contra;
        System.out.println("MAMA");
        System.out.println("Escribe la nueva contrase�a:");
        contra = teclado.nextLine();
        return contra;
    }
    
}
