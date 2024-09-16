/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soto_alexander.practica.pkg2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos tipos de usuarios desea crear? ");
        int numTiposUsuarios = scanner.nextInt();
        scanner.nextLine(); 
        TipoUsuario[] tiposUsuarios = new TipoUsuario[numTiposUsuarios];
        for (int i = 0; i < numTiposUsuarios; i++) {
            System.out.println("\nIngrese los datos del tipo de usuario " + (i + 1) + ":");
            System.out.print("Nombre del tipo de usuario: ");
            String tipoNombre = scanner.nextLine();
            System.out.print("Estado del tipo de usuario (true/false): ");
            boolean estado = scanner.nextBoolean();
            scanner.nextLine(); 
            tiposUsuarios[i] = new TipoUsuario(tipoNombre, estado);
        }
        System.out.print("\nCuantos usuarios desea crear? ");
        int numUsuarios = scanner.nextInt();
        scanner.nextLine(); 

        Usuario[] usuarios = new Usuario[numUsuarios];
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("\nIngrese los datos del usuario " + (i + 1) + ":");
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

            System.out.print("Seleccione un tipo de usuario para este usuario (0 a " + (numTiposUsuarios-1) + "): ");
            int tipoIndex = scanner.nextInt();
            scanner.nextLine(); 

            usuarios[i] = new Usuario(paterno, materno, nombres, documento, tipoDocumento, tiposUsuarios[tipoIndex]);
        }

        System.out.print("\nCuantas tarjetas desea crear? ");
        int numTarjetas = scanner.nextInt();
        scanner.nextLine(); 

        Tarjeta[] tarjetas = new Tarjeta[numTarjetas];
        for (int i = 0; i < numTarjetas; i++) {
            System.out.println("\nIngrese los datos de la tarjeta " + (i + 1) + ":");
            System.out.print("Numero de tarjeta: ");
            int numero = scanner.nextInt();
            System.out.print("Saldo inicial: ");
            float saldo = scanner.nextFloat();
            System.out.print("Estado de la tarjeta (true/false): ");
            boolean activo = scanner.nextBoolean();
            System.out.print("Precio de la tarjeta: ");
            float precio = scanner.nextFloat();
            scanner.nextLine(); 
            System.out.print("Seleccione un usuario para esta tarjeta (0 a " + (numUsuarios-1) + "): ");
            int usuarioIndex = scanner.nextInt();
            scanner.nextLine(); 

            tarjetas[i] = new Tarjeta(numero, saldo, activo, precio, usuarios[usuarioIndex]);
        }

        for (int i = 0; i < numTarjetas; i++) {
            System.out.println("\nInformación de la tarjeta " + (i + 1) + ":");
            System.out.println("Número: " + tarjetas[i].getNumero());
            System.out.println("Saldo: " + tarjetas[i].getSaldo());
            System.out.println("Precio: " + tarjetas[i].getPrecio());
            System.out.println("Usuario asociado: " + tarjetas[i].getUsuario().getNombres() + " " + tarjetas[i].getUsuario().getPaterno());
            System.out.println("Tipo de Usuario: " + tarjetas[i].getUsuario().getTipoUsuario().getNombre());
        }

       System.out.print("\nDesea recargar alguna tarjeta? (si/no): ");
String respuesta = scanner.nextLine();
if (respuesta.equalsIgnoreCase("si")) {
    System.out.print("Ingrese el numero de tarjeta a recargar (0 a " + (numTarjetas-1) + "): ");
    int tarjetaIndex = scanner.nextInt();
    System.out.print("Ingrese el monto a recargar: ");
    float monto = scanner.nextFloat();
    if (tarjetas[tarjetaIndex].recargar(monto)) {
        System.out.println("Recarga exitosa. Nuevo saldo: " + tarjetas[tarjetaIndex].getSaldo());
    } else {
        System.out.println("Recarga fallida.");
    }
} else { 
    System.out.print("Ingrese el numero de tarjeta a consumir (0 a " + (numTarjetas-1) + "): ");
    int tarjetaIndex = scanner.nextInt();
    System.out.print("Ingrese el monto a consumir (no se olvide que tambien se le descontara el precio de la tarjeta): ");
    float monto = scanner.nextFloat();
    if (tarjetas[tarjetaIndex].consumir(monto)) {
        System.out.println("Consumo exitoso. Nuevo saldo: " + tarjetas[tarjetaIndex].getSaldo());
    } else {
        System.out.println("Consumo fallido.");
    }
}

scanner.close();}
    }
