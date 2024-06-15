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
public class Alumnos {

    public String nombre;
    public String apellido;
    public String carne;
    public String password;
    public double Nota = 0; 
    public ArrayList<Curso> cursos = new ArrayList<>();
    public static Curso cursosLogeado = new Curso();
    


    public double obtenerpromedio() {
        int cantidad = cursos.size();
        double total = 0; 
        for(Curso c: cursos){
            
            total += c.nota;
            
        }
        if(cantidad>0 && total > 0){
            return total / cantidad;
        
        }else{
            return 0;
        }
    }

}
