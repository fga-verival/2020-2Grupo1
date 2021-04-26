/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdb;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author root
 */
public class CdbTest {  

    @Test
    public void testCalcularRendimentoBruto() {
       Cdb cdb = new Cdb(1000,8.5f,60);
       assertEquals(13.97f,cdb.calcularRendimentoBruto(),0.05);
    }
    
    @Test
    public void testCalcularRendimentoBruto2() {
       Cdb cdb = new Cdb(500,8.0f,120);
       assertEquals(13.15f,cdb.calcularRendimentoBruto(),0.05);
    }
    
    @Test
    public void testCalcularRendimentoBruto3() {
       Cdb cdb = new Cdb(2500,9.0f,700);
       assertEquals(431.51f,cdb.calcularRendimentoBruto(),0.05);
    }
    
    @Test
    public void testCalcularImposto() {
        Cdb cdb = new Cdb(3000, 9f, 240);
        assertEquals(35.51, cdb.calcularImposto(), 0.05);
    }
    
    @Test
    public void testCalcularImposto2() {
        Cdb cdb = new Cdb(2000, 8.5f, 270);
        assertEquals(25.15, cdb.calcularImposto(), 0.05);
    }
    
    @Test
    public void testCalcularImposto3() {
        Cdb cdb = new Cdb(100, 7.5f, 390);
        assertEquals(1.40, cdb.calcularImposto(), 0.05);
    }
    
    @Test
    public void testCalcularRendimentoLiquido() {
        Cdb cdb = new Cdb(2500, 9.0f, 700);
        assertEquals(14.2397f, cdb.calcularRendimentoLiquido(), 0.05);
    }
    
    @Test
    public void testCalcularRendimentoLiquido2() {
        Cdb cdb = new Cdb(4200, 9.5f, 900);
        assertEquals(19.9110f, cdb.calcularRendimentoLiquido(), 0.05);
    }
}
