
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Curso {
    private static int nextid = 0; 
    public int id;
    public String nombre;
    public String seccion;
    public String fechainicio;
    public String fechafin;
    public String horainicio;
    public String horafin;
    public String profe;
    public double nota; 
    public ArrayList<Alumnos> alumnos = new ArrayList<>();
    
    
  public Curso(){
      this.id =nextid;
      nextid++;
  }
    
}
