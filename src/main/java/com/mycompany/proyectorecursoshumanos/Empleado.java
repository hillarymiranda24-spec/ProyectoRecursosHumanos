package com.mycompany.proyectorecursoshumanos;

// Clase hija que hereda de Persona
public class Empleado extends Persona {
    private String departamento;
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(String identificacion, String nombre, String correo, String departamento, String puesto, double salario) {
        super(identificacion, nombre, correo); // Hereda atributos de Persona
        this.departamento = departamento;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getters y Setters específicos de Empleado
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método para mostrar la información del empleado
    public void mostrarDetalles() {
        System.out.println("ID: " + getIdentificacion() + " | Nombre: " + getNombre() + 
                           " | Dept: " + departamento + " | Puesto: " + puesto + " | Salario: $" + salario);
    }
}