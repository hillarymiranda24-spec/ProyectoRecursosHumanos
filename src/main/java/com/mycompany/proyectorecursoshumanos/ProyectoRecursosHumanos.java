package com.mycompany.proyectorecursoshumanos;

public class ProyectoRecursosHumanos {
    public staticmain(String[] args) {
        // Instanciamos el controlador que maneja el ArrayList
        ControladorRH sistema = new ControladorRH();

        // Creación de objetos Empleado
        Empleado emp1 = new Empleado("703240649", "Hillary Miranda", "johavilo021185@gmail.com", "Tecnología", "Desarrolladora Software", 1200.0);
        Empleado emp2 = new Empleado("109870654", "Carlos Gómez", "carlos@gmail.com", "Recursos Humanos", "Asistente de RRHH", 850.0);

        // Agregando objetos a la colección
        sistema.agregarEmpleado(emp1);
        sistema.agregarEmpleado(emp2);

        // Consultando la información almacenada
        sistema.mostrarEmpleados();
    }
}