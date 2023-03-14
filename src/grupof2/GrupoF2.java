/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupof2;

import modulos.login;

/**
 *
 * @author aleja
 */
public class GrupoF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // función de llamado al módulo de login.
        login log= new login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
    }
    
}
