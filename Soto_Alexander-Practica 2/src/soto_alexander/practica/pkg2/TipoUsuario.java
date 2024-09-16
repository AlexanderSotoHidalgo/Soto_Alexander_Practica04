/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soto_alexander.practica.pkg2;

public class TipoUsuario {
    private String nombre;
    private boolean estado;

    public TipoUsuario(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    // Métodos Getters
    public boolean getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }
}
