/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soto_alexander.practica01;

/**
 *
 * @author Alex
 */
public class Tarjeta {
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;

    Tarjeta() {
        this.numero = 0;
        this.saldo = 0.0f;
        this.activo = false;
        this.precio = 0.0f;
    }

    Tarjeta(int numero, float saldo, boolean activo, float precio) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio = precio;
    }

    public int obtenerNumero() {
        return numero;
    }

    public void decirNumero(int numero) {
        this.numero = numero;
    }

    public float obtenerSaldo() {
        return saldo;
    }

    public void decirSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean esActivo() {
        return activo;
    }

    public void decirActivo(boolean activo) {
        this.activo = activo;
    }

    public float obtenerPrecio() {
        return precio;
    }

    public void decirPrecio(float precio) {
        this.precio = precio;
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
