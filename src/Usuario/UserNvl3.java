/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author raulz
 */
public class UserNvl3 extends UserNvl2 {
    
    
    public UserNvl3(String nombre, String contra, int seguridad){
        super(nombre,contra,seguridad);
        comprobarContra();
        
    }
    
    
    @Override
    public void comprobarContra() {
        super.comprobarContra();

        boolean aceptada = false;
        do {
            int contadorEsp = 0;

            for (int i = 0; i < super.getContra().length(); i++) {
                if (super.getContra().charAt(i) > 32 && super.getContra().charAt(i) < 48) {
                    contadorEsp++;
                }
            }
            if (contadorEsp > 1) {
                aceptada = true;
            } else {
                System.out.println("Introduzca 2 digitos especiales e intentelo de nuevo");
                super.setContra(teclado.nextLine());
            }
        } while (!aceptada);

    }
    
}
