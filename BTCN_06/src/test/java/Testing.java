/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BTCN_06.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows
 */
public class Testing {
    
    public Testing() {
    }
    
    @Test
    public void tc_01() {
        String rs = Main.typeTriangle(0, 0, 0);
        String expected = "Khong phai tam giac";
        assertEquals("My error message",rs, expected);
	}
        @Test
    public void tc_02() {
        String rs = Main.typeTriangle(3, 4, 5);
        String expected = "Tam giac vuong";
        assertEquals("My error message",rs, expected);
	}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
