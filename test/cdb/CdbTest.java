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
       assertEquals(cdb.calcularRendimentoBruto(), 13.97f,0);
    }
    
    @Test
    public void testCalcularRendimentoBruto2() {
       Cdb cdb = new Cdb(500,8.0f,120);
       assertEquals(cdb.calcularRendimentoBruto(), 13.15f,0);
    }
    
}
