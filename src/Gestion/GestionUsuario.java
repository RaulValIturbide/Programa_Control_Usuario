/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Interfaz.Menu;
import java.util.ArrayList;
import Usuario.*;
/**
 *
 * @author raulz
 */
public class GestionUsuario{
    
   
    ArrayList<Usuario> lista = new ArrayList<Usuario>();
    
    public void mostrarLista(){
        for(int i = 0; i < lista.size() ; i++){
            System.out.println("Usuario " + i+1 + ":");
            lista.get(i).mostrarDatos();
        }
    
    }

    
    /**
     * Este metodo genera un usuario y lo añade a la lista de arrays
     * @param seguridad es el nivel de seguridad que hará crear uno u otro tipo de usuario
     */
    public void crearUsuario(int seguridad){    
        String contra;
        String nombre;
        Menu.limpiarBuffer();
        switch(seguridad){
            case 1:
                nombre = Menu.pedirNombre();
                contra = Menu.pedirContra();
                UserNvl1 user1 = new UserNvl1(nombre,contra,seguridad);
                lista.add(user1);
                break;
            case 2:
                nombre = Menu.pedirNombre();
                contra = Menu.pedirContra();
                UserNvl2 user2 = new UserNvl2(nombre,contra,seguridad);
                lista.add(user2);
                break;
            case 3:
                nombre = Menu.pedirNombre();
                contra = Menu.pedirContra();
                UserNvl3 user3 = new UserNvl3(nombre,contra,seguridad);
                lista.add(user3);
                break;
                
        }
    }
}
