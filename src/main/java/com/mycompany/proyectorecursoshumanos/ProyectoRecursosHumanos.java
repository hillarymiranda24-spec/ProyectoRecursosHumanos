package com.mycompany.proyectorecursoshumanos;

import com.mycompany.proyectorecursoshumanos.vista.FrmGestionEmpleados;

public class ProyectoRecursosHumanos {

    public static void main(String[] args) {

        // Iniciar la interfaz gráfica del sistema.
        java.awt.EventQueue.invokeLater(() -> {
            FrmGestionEmpleados ventana = new FrmGestionEmpleados();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });
    }
}