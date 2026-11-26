package com.mycompany.proyectorecursoshumanos;

/**
 * Clase encargada de validar datos ingresados por el usuario.
 * Autora: Katherine
 */
public class Validaciones {

    /**
     * Verifica si un campo está vacío.
     * @param texto
     * @return 
     */
    public static boolean campoVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

    /**
     * Valida que la cédula tenga exactamente 9 números.
     * @param cedula
     * @return 
     */
    public static boolean cedulaValida(String cedula) {

        if (cedula == null) {
            return false;
        }

        return cedula.matches("\\d{9}");
    }

    /**
     * Valida que el correo tenga @ y .
     * @param correo
     * @return 
     */
    public static boolean correoValido(String correo) {

        if (correo == null) {
            return false;
        }

        return correo.contains("@")
                && correo.contains(".");
    }

    /**
     * Valida que el salario sea mayor que cero.
     * @param salario
     * @return 
     */
    public static boolean salarioValido(double salario) {
        return salario > 0;
    }

}
