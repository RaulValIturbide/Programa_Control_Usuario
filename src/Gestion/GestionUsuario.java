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
             System.out.println("**********************");
            System.out.println("Usuario " + (i+1) + ":");
            lista.get(i).mostrarDatos();
        }
    
    }
    /**
     * Busca en la lista la posición donde se encuentra el usuario que estamos
     * buscando
     *
     * @return nos devolverá la posicion (index) donde se encuentra el usuario o
     * -1 si el usuario no ha sido encontrado
     * @param usuario El usuario que el metodo busca en el  listado
     */
    public int encontrarUsuario(Usuario usuario) {
        boolean encontrada = false;
        int posicion = 0;

        if (lista.isEmpty()) {
            return -1;
        }

        do {
            if (lista.get(posicion).getNombre().equals(usuario.getNombre()) && lista.get(posicion).getContra().equals(usuario.getContra())) {
                encontrada = true;
            } else {
                posicion++;
            }

        } while (!encontrada && posicion < lista.size());
        if (!encontrada || posicion == lista.indexOf(usuario)) {
            posicion = -1;
        }
        return posicion;

    }

    
    /**
     * Este metodo genera un usuario y lo añade a la lista de arrays
     * @param seguridad es el nivel de seguridad que hará crear uno u otro tipo de usuario
     */
    public void crearUsuario(int seguridad){    
        String contra;
        String nombre;
        int repetido;
        Menu.limpiarBuffer();
        switch(seguridad){
            case 1:
                UserNvl1 user1;
                do{
                nombre = Menu.pedirNombre();
                contra = Menu.pedirContra();
                user1 = new UserNvl1(nombre, contra, seguridad);
                repetido = encontrarUsuario(user1);
                Menu.usuarioRepetido(repetido);
                }while(repetido != -1);
                lista.add(user1);

                break;
            case 2:
                UserNvl2 user2;
                do{
                nombre = Menu.pedirNombre();
                contra = Menu.pedirContra();
                user2 = new UserNvl2(nombre,contra,seguridad);
                repetido = encontrarUsuario(user2);
                }while(repetido != -1);
                lista.add(user2);
                break;
            case 3:
                UserNvl3 user3;
                do{
                nombre = Menu.pedirNombre();
                contra = Menu.pedirContra();
                user3 = new UserNvl3(nombre,contra,seguridad);
                repetido = encontrarUsuario(user3);
                }while(repetido != -1);
                lista.add(user3);
                break;
                
        }
    }
    /**
     * Este metodo sirve para eliminar un usuario y depende de el nombre y contraseña que el usuario introduzca por pantalla
     */
    public void eliminarUsuario() {
        String[] aDatos = Menu.recogerUsuario();
        String nombre = aDatos[0];
        String contra = aDatos[1];
        boolean encontrada = false;
        int contador = 0;

        while (!encontrada && contador < lista.size()) {
            if (lista.get(contador).getNombre().equals(nombre) && lista.get(contador).getContra().equals(contra)) {
                encontrada = true;
                lista.remove(contador);
            } else {
                contador++;
            }
        }
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacía");
        }else if(!encontrada){
            System.out.println("Este nombre y contraseña no existen, compruebe que ha introducido los datos correctamente e intentelo de nuevo");
        }

    }
    public void cambiarContra() {
        String[] aDatos = Menu.recogerUsuario();
        String nombre = aDatos[0];
        String viejaContra = aDatos[1];
        String nuevaContra;
        boolean encontrada = false;
        int contador = 0;

        while (!encontrada && contador < lista.size()) {
            if (lista.get(contador).getNombre().equals(nombre) && lista.get(contador).getContra().equals(viejaContra)) {
                nuevaContra = Menu.nuevaContra();
                encontrada = true;
                lista.get(contador).setContra(nuevaContra);

            } else {
                contador++;
            }

        }

    }
}
