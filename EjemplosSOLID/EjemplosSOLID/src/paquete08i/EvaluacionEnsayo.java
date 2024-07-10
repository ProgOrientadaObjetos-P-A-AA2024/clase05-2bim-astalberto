/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete08i;

/**
 *
 * @author reroes
 */
public class EvaluacionEnsayo implements EvaluacionTipoDos {

    private int numeroProblemas;
    private double totalProblemas;
    protected double promedioEnsayo;

    
    public void establecerNumeroProblemas(int n) {
        numeroProblemas = n;
    }

    public void establecerTotalProblemas(double n) {
        totalProblemas = n;
    }

    public int obtenerNumeroProblemas() {
        return numeroProblemas;
    }

    public double obtenerTotalProblemas() {
        return totalProblemas;
    }
    
    
    @Override  
    public void establecerPromedioEnsayo() {

        promedioEnsayo = obtenerTotalProblemas() / obtenerNumeroProblemas();

    }
    /*
        Los metodos provenientes de la interfaz EvaluacionTipoDos cumplen una 
    funcion parecida a las clases abstractas, solo que estas se definen en la 
    interfaz y se implementa en la clase que se va a usar
    */
    @Override
    public double obtenerPromedioEnsayo() {
        return promedioEnsayo;

    }
    
}
