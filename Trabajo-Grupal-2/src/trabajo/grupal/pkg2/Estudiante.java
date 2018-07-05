/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.grupal.pkg2;

/**
 *
 * @author Israel
 */
public class Estudiante {
// Declaración de variables globales
    String nombre;
    String apellido;
    int edad;
    double calificacion1;
    double calificacion2;
// Método para presentar el reporte
    public void presentar() {
        System.out.printf("%s %s\nEdad: %d\nCalificacion 1: %.1f\nCalificacion 2: %.1f\nPromedio: %.1f\n\n", nombre, apellido, edad,
                calificacion1, calificacion2, obtener_promedio());

    }
// Método con la operación requerida para obtener el promedio
    public double obtener_promedio() {
        double promedio = 0;
        promedio = (calificacion1 + calificacion2) / 2;
        return promedio;

    }
}
