package com.mycompany.proyectorecursoshumanos;

import java.util.ArrayList;

public class ControladorRH {
    private ArrayList<Empleado> listaEmpleado;

    // Constructor
    public ControladorRH() {
        listaEmpleado = new ArrayList<>();
    }

    // Método para registrar un empleado (Crear)
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleado.add(empleado);
        System.out.println("Empleado " + empleado.getNombre() + " registrado exitosamente.");
    }

    // Método para consultar/mostrar todos los empleados
    public void mostrarEmpleados() {
        System.out.println("\n--- LISTA DE EMPLEADOS REGISTRADOS ---");
        if (listaEmpleado.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : listaEmpleado) {
                emp.mostrarDetalles();
            }
        }
    }
}