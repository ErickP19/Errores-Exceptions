/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author erics
 */
public class Programa {
     public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        ValidacionesPersona venPersona  = new ValidacionesPersona(persona);
        venPersona.setVisible(true);
    }
}
