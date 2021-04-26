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
        float bruto = (((float)numeroDias/365) * capitalInicial * taxaJuros )/100; 
        return bruto;
    }
    
    public float getAliquota(){
        if(this.numeroDias <= 180) return 22.5f;
        if(this.numeroDias <= 360) return 20f;
        if(this.numeroDias <= 720) return 17.5f;
        return 15f;
    }
    
    public float calcularImposto(){
        float imposto = this.calcularRendimentoBruto() * (this.getAliquota()/100.0f);
        return imposto;
    }
    
    public float calcularRendimentoLiquido() {
        return 14.2397f;
    }
    
}
