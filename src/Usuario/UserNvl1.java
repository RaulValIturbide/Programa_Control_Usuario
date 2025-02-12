/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;
import java.util.Scanner;

/**
 *
 * @author raulz
 */
public class UserNvl1 extends Usuario {
    static Scanner teclado = new Scanner(System.in);
    
    public UserNvl1(String nombre,String contra, int seguridad){
        super(nombre,contra,seguridad);
        comprobarContra();
    }
    
    @Override
    public void comprobarContra() {
        boolean aceptada = false;      
        do {
            int contadorDig = 1;
            for (int i = 0; i < super.getContra().length(); i++) {
                if ((super.getContra().charAt(i) > 64 && super.getContra().charAt(i) < 91) || (super.getContra().charAt(i) > 96 && super.getContra().charAt(i) < 123)) {
                    contadorDig++;
                }
            }
            if (contadorDig >= 10) {
                aceptada = true;
            } else {
                System.out.println("Contraseña no valida, introduzca más de 10 letras e intentelo de nuevo");
                super.setContra(teclado.nextLine()); 
            }

        } while (!aceptada);
    }

    
    
}
