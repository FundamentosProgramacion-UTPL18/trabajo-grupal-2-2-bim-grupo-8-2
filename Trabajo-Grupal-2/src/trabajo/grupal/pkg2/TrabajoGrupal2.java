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
public class TrabajoGrupal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante[] estudiantes = new Estudiante[5];
        String nombres[] = {"José", "María", "Ana", "Paul", "David"};
        String apellidos[] = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int edad[] = {20, 19, 20, 19, 25};
        double calificacion_1[] = {9.1, 10, 8, 7, 9.1};
        double calificacion_2[] = {6.1, 5, 10, 7.2, 4.1};
        double promedio[] = {0, 0, 0, 0, 0};
        double suma = 0;
        double promedio_final;
        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante estu = new Estudiante();
            estu.nombre = nombres[i];
            estu.apellido = apellidos[i];
            estu.edad = edad[i];
            estu.calificacion1 = calificacion_1[i];
            estu.calificacion2 = calificacion_2[i];
            estudiantes[i] = estu;
        }
        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante estu = estudiantes[i];
            estu.presentar();
        }

    }

}
