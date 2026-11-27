package com.mycompany.proyectorecursoshumanos;

import com.mycompany.proyectorecursoshumanos.logica.ControladorRH;
import com.mycompany.proyectorecursoshumanos.modelo.Empleado;
import com.mycompany.proyectorecursoshumanos.vista.FrmGestionEmpleados;

public class ProyectoRecursosHumanos {

    public static void main(String[] args) {

        // Instanciar el controlador
        ControladorRH sistema = new ControladorRH();

        // Crear empleados de prueba
        Empleado emp1 = new Empleado("703240649", "Hillary Miranda",
                "johavilo021185@gmail.com", "Tecnología",
                "Desarrolladora Software", 1200.0);

        Empleado emp2 = new Empleado("109870654", "Carlos Gómez",
                "carlos@gmail.com", "Recursos Humanos",
                "Asistente de RRHH", 850.0);

        // Agregar empleados
        sistema.agregarEmpleado(emp1);
        sistema.agregarEmpleado(emp2);

        // Mostrar empleados registrados
        sistema.mostrarEmpleados();

        // Iniciar la interfaz gráfica
        java.awt.EventQueue.invokeLater(() -> {
            FrmGestionEmpleados ventana = new FrmGestionEmpleados();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });
    }
}