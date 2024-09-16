/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soto_alexander.practica.pkg2;

public class Tarjeta {
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;
    private Usuario usuario;  

    public Tarjeta(int numero, float saldo, boolean activo, float precio, Usuario usuario) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio = precio;
        this.usuario = usuario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

     public boolean recargar(float monto) {
        if (monto > 0) {
            this.saldo = monto+saldo;
            return true;
        }
        return false;
    }

    public boolean consumir(float monto) {
        if (monto > 0 && this.saldo >= monto+precio) {
            this.saldo = saldo-monto-precio;
            return true;
        }
        return false;
    }
}


