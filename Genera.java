/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cisneros;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Jose Maria
 */
public class Genera {
 
    
    public String Generar_Clave(String Nombre, String Apellidos, String Id) throws NoSuchAlgorithmException {
        // Genera la contraseña
        // La variable ID indica si es usuario del programa o alumno.
        String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int length = 2;
        Random random;
        random = SecureRandom.getInstanceStrong();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int indexRandom = random.nextInt ( symbols.length );
            sb.append( symbols[indexRandom] );
        }
        String password = sb.toString();
        
        String Nombre_Pass = Nombre;
        String Apellidos_Pass = Apellidos;
        
        String Nombre_cadena = Nombre_Pass.substring(0,4);
        String Apellidos_cadena = Apellidos_Pass.substring(0,4);
        
        if("AL".equals(Id)) {
            return "AL" + Nombre_cadena + Apellidos_cadena + "-" + password;
        } else {
            return "US" + Nombre_cadena + Apellidos_cadena + "-" + password;
        }
    }

    
    public String Generar_Certificado() {
        String[] symbols = {"0", "1", "-", "2", "3", "4", "a", "b", "c","d","e","f","g","h","i","j","K","L","M","N","O","P","Q","R","S","T","U"};
        int length = 8;
        Random random;
        try {
            random = SecureRandom.getInstanceStrong();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                 int indexRandom = random.nextInt ( symbols.length );
                 sb.append( symbols[indexRandom] );
            }
            String password = sb.toString();
                return password;
          } catch (NoSuchAlgorithmException e){
                return e.toString();
          } 
    }
}
    

