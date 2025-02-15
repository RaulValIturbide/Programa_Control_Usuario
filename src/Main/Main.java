/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Interfaz.Menu;
import Gestion.*;
import java.util.Scanner;
import Usuario.*;

/**
 *
 * @author raulz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestionUsuario gestion = new GestionUsuario();

        int usuario;

        do {
            
            usuario = Menu.introduccion();
            switch (usuario) {
                case 1:
                    //Alta usuario
                    int seguridad = Menu.nivelSeguridad();
                    gestion.crearUsuario(seguridad);
                    break;
                case 2:
                    //Baja usuario
                    gestion.eliminarUsuario();
                    break;
                case 3:
                    //Cambiar contraseña
                    gestion.cambiarContra();
                    
                    break;
                case 4:
                    //Entrar al sitio
                    break;
                case 5:
                    //Lista de usuarios
                    gestion.mostrarLista();
                    break;
                
 

            }
        } while (usuario != 0);

    }
}
