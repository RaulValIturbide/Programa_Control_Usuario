/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author raulz
 */
public class UserNvl2 extends UserNvl1 {
    
    public UserNvl2(String nombre, String contra, int seguridad){
        super(nombre,contra,seguridad);
        comprobarContra();
        
    }
    
    
    
    @Override
    public void comprobarContra() {
        super.comprobarContra();
        boolean aceptada = false;

        do {
            int contadorDig = 0;
            for (int i = 0; i < super.getContra().length(); i++) {
                if (super.getContra().charAt(i) > 47 && super.getContra().charAt(i) < 58) {
                    contadorDig++;
                }
            }
            if (contadorDig > 1) {
                aceptada = true;
            } else {
                System.out.println("Añada al menos 2 digitos a su contraseña e intentelo de nuevo");
                super.setContra(teclado.nextLine());
            }

        } while (!aceptada);

    }
}
