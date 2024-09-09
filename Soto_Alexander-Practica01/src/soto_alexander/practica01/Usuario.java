/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soto_alexander.practica01;

/**
 *
 * @author Alex
 */

public class Usuario {
    private String paterno;
    private String materno;
    private String nombres;
    private String documento;
    private String tipoDocumento;

     Usuario() {
        this.paterno = "";
        this.materno = "";
        this.nombres = "";
        this.documento = "";
        this.tipoDocumento = "";
    }

     Usuario(String paterno, String materno, String nombres, String documento, String tipoDocumento) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    public String obtenerApellidoPaterno() {
        return paterno;
    }

    public void decirApellidoPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String obtenerApellidoMaterno() {
        return materno;
    }

    public void decirApellidoMaterno(String materno) {
        this.materno = materno;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void mostrarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtenerDocumento() {
        return documento;
    }

    public void mostrarDocumento(String documento) {
        this.documento = documento;
    }

    public String obtenerTipoDocumento() {
        return tipoDocumento;
    }

    public void mostrarTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public float recargar(float monto) {
        return monto;
    }

    public boolean consumir() {
        return true;
    }
}