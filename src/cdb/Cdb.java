/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdb;

/**
 *
 * @author root
 */
public class Cdb {

    private float capitalInicial;
    private float taxaJuros;
    private int numeroDias;

    public Cdb(float capitalInicial, float taxaJuros, int numeroDias) {
        this.capitalInicial = capitalInicial;
        this.taxaJuros = taxaJuros;
        this.numeroDias = numeroDias;
    }
    
    public float calcularRendimentoBruto(){
           return 13.97f;
    }

}
