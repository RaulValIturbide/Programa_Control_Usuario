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
                           ¿Qué deseas hacer?
                           1-Alta usuario
                           2-Baja usuario
                           3-Cambiar contraseña
                           4-Entrar al sitio
                           5-Listado de usuarios
                           otro-salir
                           """);
        int usuario = teclado.nextInt();
        return usuario;
    }
    /**
     * Este metodo pedirá al usuario que nivel de seguridad quiere de 1 a 3
     * @return el nivel de seguridad del 1 al 3
     */
    public static int nivelSeguridad() {
        int nivel = 0;
        System.out.println("¿Qué nivel deseas que sea tu usuario? (1,2 o 3)");
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
        System.out.println("Dame una contraseña para tu usuario");
        String contra = teclado.nextLine();
        return contra;
    }
    public static void limpiarBuffer(){
        teclado.nextLine();
    }
}
