/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;


import java.util.Scanner;
public class Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArregloAlumnos alumnos = new ArregloAlumnos();
        String continuar = "S";
        while (continuar.equalsIgnoreCase("S")) {
            Alumno at = new Alumno();
            System.out.print("Ingrese el codigo del alumno: ");
            String codigo = scanner.nextLine();
            if (alumnos.buscarAlumno(codigo)) {
                System.out.println("El alumno con el código " + codigo + " ya está registrado.");
            } else {
                System.out.print("Ingrese el nombre del alumno: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el promedio final del alumno: ");
                int promediofinal = scanner.nextInt();
                scanner.nextLine(); 
                at.setCodigo(codigo);
                at.setNombre(nombre);
                at.setPromedioFinal(promediofinal);
                alumnos.agregar(at);
            }
            System.out.print("Desea ingresar otro alumno? (S/N): ");
            continuar = scanner.nextLine();
        }
        System.out.println("Lista de alumnos registrados:");
        System.out.println(alumnos);
    }
}

class Alumno {
    private String codigo;
    private String nombre;
    private int promedioFinal;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedioFinal(int promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPromedioFinal() {
        return promedioFinal;
    }

    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Promedio Final: " + promedioFinal;
    }
}

class ArregloAlumnos {
    private Alumno[] alumnos;
    private int indice;

    public ArregloAlumnos() {
        alumnos = new Alumno[100]; 
        indice = 0;
    }

    public void agregar(Alumno alumno) {
        if (indice < alumnos.length) {
            alumnos[indice] = alumno;
            indice++;
        } else {
            System.out.println("No se puede agregar más alumnos");
        }
    }

    public boolean buscarAlumno(String codigo) {
        for (int i = 0; i < indice; i++) {
            if (alumnos[i].getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indice; i++) {
            sb.append(alumnos[i].toString()).append("\n");
        }
        return sb.toString();
    }
}

