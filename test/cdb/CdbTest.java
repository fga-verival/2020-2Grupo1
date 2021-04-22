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
    
    private Cdb cdb;
    
    @Before
    public void setUp() {
        cdb = new Cdb();
    }
   

    @Test
    public void testMain() {
        assertEquals(1,1);
    }
    
}
