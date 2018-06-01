package Account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAGAR KALAL
 */
public class TestBanking {
    Account a=new Account();
    
    public TestBanking() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAddAccount()
    {
        assertEquals(100,a.addAccount(100));
        
    }
    
    @Test
    public void testDeposit()
    {
        assertEquals(500,a.deposit(0,100));
        assertEquals(1000,a.deposit(500,100));
        assertEquals(1888,a.deposit(888,100));
    }
    
    @Test
    public void testWithdraw()
    {
        assertEquals(300,a.withdraw(200,100));
        assertEquals(200,a.withdraw(100,100));
    }


}