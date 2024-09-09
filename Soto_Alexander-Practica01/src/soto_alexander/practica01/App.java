
package soto_alexander.practica01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del usuario:");
        System.out.print("Apellido paterno: ");
        String paterno = scanner.nextLine();
        System.out.print("Apellido materno: ");
        String materno = scanner.nextLine();
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Documento: ");
        String documento = scanner.nextLine();
        System.out.print("Tipo de documento: ");
        String tipoDocumento = scanner.nextLine();

        Usuario usuario = new Usuario(paterno, materno, nombres, documento, tipoDocumento);
        
        System.out.println("\nIngrese los datos de la tarjeta:");
        System.out.print("Numero de tarjeta: ");
        int numero = scanner.nextInt();
        System.out.print("Saldo inicial: ");
        float saldo = scanner.nextFloat();
        System.out.print("Estado de la tarjeta (true para activa, false para inactiva): ");
        boolean activo = scanner.nextBoolean();
        System.out.print("Precio de la tarjeta: ");
        float precio = scanner.nextFloat();

        Tarjeta tarjeta = new Tarjeta(numero, saldo, activo, precio);

        System.out.print("\nIngrese el monto a recargar en la tarjeta: ");
        float recarga = scanner.nextFloat();
        if (tarjeta.recargar(recarga)) {
            System.out.println("Recarga exitosa. Saldo actual: " + tarjeta.obtenerSaldo());
        } else {
            System.out.println("Recarga fallida.");
        }

        System.out.print("\nIngrese el monto a consumir de la tarjeta: ");
        float consumo = scanner.nextFloat();
        if (tarjeta.consumir(consumo)) {
            System.out.println("El consumo resulto exitoso.Tu saldo actual es " + tarjeta.obtenerSaldo());
        } else {
            System.out.println("El saldo es insuficiente o el consumo resulto fallido.");
        }

        scanner.close();
    }
}