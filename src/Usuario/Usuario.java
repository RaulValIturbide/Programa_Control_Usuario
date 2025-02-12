/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author raulz
 */
public abstract class Usuario {
    
    private String nombre;//El nombre del usuario
    private String contra;//La contraseña del usuario
    private int seguridad;//El nivel de la contraseña del usuario
    
    
    protected Usuario(String nombre, String contra,int seguridad){
        this.nombre = nombre;
        this.contra = contra;
        this.seguridad = seguridad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setContra(String contra){
        this.contra = contra;
    }
    public String getContra(){
        return contra;
    }
    public void setSeguridad(int seguridad){
        this.seguridad = seguridad;
    }
    public int getSeguridad(){
        return seguridad;
    }
    public void mostrarDatos(){
        System.out.format("""
                          Nombre de usuario: %s
                          Contraseña: %s
                          Nivel: %d
                          """,nombre,contra,seguridad);
    }
    
    public abstract void comprobarContra();
    
    
    
}
