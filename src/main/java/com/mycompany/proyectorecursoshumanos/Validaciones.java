package com.mycompany.proyectorecursoshumanos;

/**
 * Clase para validar los datos ingresados en el formulario.
 *
 * @author Katherine
 */
public class Validaciones {

    /**
     * Verifica si un campo está vacío.
     *
     * @param texto texto a validar
     * @return true si está vacío, false si contiene datos
     */
    public static boolean campoVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

    /**
     * Valida que la identificación tenga exactamente 9 dígitos.
     *
     * @param cedula identificación a validar
     * @return true si es válida
     */
    public static boolean cedulaValida(String cedula) {

        if (cedula == null) {
            return false;
        }

        return cedula.matches("\\d{9}");
    }

    /**
     * Valida el formato del correo electrónico.
     *
     * @param correo correo a validar
     * @return true si es válido
     */
    public static boolean correoValido(String correo) {

        if (correo == null) {
            return false;
        }

        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    /**
     * Valida que el salario sea mayor que cero.
     *
     * @param salario salario a validar
     * @return true si es válido
     */
    public static boolean salarioValido(double salario) {
        return salario > 0;
    }
}