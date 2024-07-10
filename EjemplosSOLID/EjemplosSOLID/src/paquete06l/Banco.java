/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class Banco {

    String nombre;

    public Banco(String nomb) {
        nombre = nomb;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
