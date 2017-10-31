/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryan
 */
public class ProductTest {

    public ProductTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getProductID method, of class Product.
     */
    @Test
    public void testGetProductID() {
    }

    /**
     * Test of setProductID method, of class Product.
     */
    @Test
    public void testSetProductID() {
    }

    /**
     * Test of getProductName method, of class Product.
     */
    @Test
    public void testGetProductName() {
    }

    /**
     * Test of setProductName method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void productNameShouldBeNotNull(){
        Product test = new Product("A101", null, 10, new QtyFlatDiscount(10));
 

    }

    @Test(expected = IllegalArgumentException.class)
    public void productNameShouldBeNotEmpty() {
        Product test = new Product("A101", "", 10, new QtyFlatDiscount(10));


    }

    /**
     * Test of getProductDescription method, of class Product.
     */
    @Test
        public void testGetProductDescription() {
    }

    /**
     * Test of setProductDescription method, of class Product.
     */
    @Test
        public void testSetProductDescription() {
    }

    /**
     * Test of getProductUnitPrice method, of class Product.
     */
    @Test
        public void testGetProductUnitPrice() {
    }

    /**
     * Test of setProductUnitPrice method, of class Product.
     */
    @Test
        public void testSetProductUnitPrice() {
    }

    /**
     * Test of getDiscount method, of class Product.
     */
    @Test
        public void testGetDiscount() {
    }

    /**
     * Test of setDiscount method, of class Product.
     */
    @Test
        public void testSetDiscount() {
    }

}
