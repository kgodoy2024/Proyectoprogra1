/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Proyecto {
    
    public static ArrayList<profesor> profesores = new ArrayList<>();
    public static profesor profesorLogeado = new profesor();
    public static ArrayList<Alumnos> alumnos = new ArrayList<>();
    public static Alumnos AlumnosLogeado = new Alumnos();
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static Curso cursosLogeado = new Curso();

    public static void main(String[] args) {
        login l = new login();
        l.setVisible(true);
    }
}
