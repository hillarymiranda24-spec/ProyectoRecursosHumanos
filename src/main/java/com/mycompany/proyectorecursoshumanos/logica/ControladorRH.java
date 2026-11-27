package com.mycompany.proyectorecursoshumanos.logica;

import com.mycompany.proyectorecursoshumanos.modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

public class ControladorRH {
    private ArrayList<Empleado> listaEmpleado;

    public ControladorRH() {
        listaEmpleado = new ArrayList<>();
    }

    // Evita cédulas/identificaciones repetidas al agregar
    public boolean agregarEmpleado(Empleado empleado) {
        if (empleado == null || empleado.getIdentificacion() == null || empleado.getIdentificacion().trim().isEmpty()) {
            return false;
        }
        String idLimpio = empleado.getIdentificacion().trim();
        if (buscarPorIdentificacion(idLimpio) != null) {
            return false;
        }
        empleado.setIdentificacion(idLimpio);
        listaEmpleado.add(empleado);
        return true;
    }

    public Empleado buscarPorIdentificacion(String identificacion) {
        if (identificacion == null) {
            return null;
        }
        String buscada = identificacion.trim();
        for (Empleado emp : listaEmpleado) {
            if (emp.getIdentificacion() != null && emp.getIdentificacion().equalsIgnoreCase(buscada)) {
                return emp;
            }
        }
        return null;
    }

    public boolean actualizarEmpleado(Empleado empleadoActualizado) {
        if (empleadoActualizado == null || empleadoActualizado.getIdentificacion() == null) {
            return false;
        }
        String idBuscado = empleadoActualizado.getIdentificacion().trim();
        for (int i = 0; i < listaEmpleado.size(); i++) {
            Empleado actual = listaEmpleado.get(i);
            if (actual.getIdentificacion() != null && actual.getIdentificacion().equalsIgnoreCase(idBuscado)) {
                empleadoActualizado.setIdentificacion(idBuscado);
                listaEmpleado.set(i, empleadoActualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEmpleado(String identificacion) {
        Empleado encontrado = buscarPorIdentificacion(identificacion);
        if (encontrado != null) {
            return listaEmpleado.remove(encontrado);
        }
        return false;
    }

    public List<Empleado> obtenerEmpleados() {
        return listaEmpleado;
    }

    public void mostrarEmpleados() {
        if (listaEmpleado.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : listaEmpleado) {
                emp.mostrarDetalles();
            }
        }
    }

    // Reglas de negocio
    public double calcularDeducciones(double salarioBruto) {
        if (salarioBruto <= 0) {
            return 0.0;
        }
        return salarioBruto * 0.10;
    }

    public double calcularSalarioNeto(double salarioBruto) {
        if (salarioBruto <= 0) {
            return 0.0;
        }
        return salarioBruto - calcularDeducciones(salarioBruto);
    }

    public int contarPorDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty() || departamento.trim().equalsIgnoreCase("Seleccione...")) {
            return 0;
        }
        String objetivo = departamento.replace(",", "").trim();
        int contador = 0;
        for (Empleado emp : listaEmpleado) {
            if (emp.getDepartamento() != null && emp.getDepartamento().replace(",", "").trim().equalsIgnoreCase(objetivo)) {
                contador++;
            }
        }
        return contador;
    }
}