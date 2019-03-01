package com.capgemini.salesmanagement.test;

import java.time.LocalDate;
import java.util.HashMap;

import javax.naming.InvalidNameException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.service.SaleService;




public class SalesManagementTest {
	public static	SaleService  service;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service= new SaleService();
	}

	@Before
	public  void  testEvn() {
		Sale sale = new Sale(1001,2,"Electronics","TV","SmartTV", 15000, LocalDate.now());
		Sale sale1 = new Sale(1002,4,"Toys","Telescope","SoftToy", 500, LocalDate.now());
	}

	@Test
	public void insertSaleForValidDetails() {
		Sale sale = new Sale(1001,2,"Electronics","TV","SmartTV", 15000, LocalDate.now());
		HashMap<Integer, Sale> expected=service.insertSaleDetails(sale);
		Sale sale1 = new Sale(1001,2,"Electronics","TV","SmartTV", 15000, LocalDate.now());
		//service.insertSaleDetails(sale1);
		HashMap<Integer, Sale> actual=service.insertSaleDetails(sale1);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void validateProductCodeForValidCase() throws InvalidProductCodeException {
		boolean expected = service.validateProductCode(1001);
		boolean actual=true;
		Assert.assertEquals(expected, actual);
	}
	@Test(expected=InvalidProductCodeException.class)
	public void validateProductCodeForInvalidCase() throws InvalidProductCodeException {
		service.validateProductCode(100001);
	}
	@Test
	public void validateProductCategoryForValidCase() throws InvalidCategoryException {
		boolean expected = service.validateProductCategory("Electronics");
		boolean actual=true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected=InvalidCategoryException.class)
	public void validateProductCategoryForInvalidCase() throws InvalidCategoryException {
		service.validateProductCategory("Mobile");
	}

	@Test
	public void validateProductNameForValidCase()throws InvalidNameException {
		boolean expected =service.validateProductName("SmartPhone");
		boolean actual =true;
		Assert.assertEquals(expected, actual);
	}

	@Test(expected=InvalidNameException.class)
	public void validateProductNameForInvalidCase() throws InvalidNameException {
		service.validateProductName("Phone");
	}
	@Test
	public void validateProductPriceForValidCase()throws InvalidProductPriceException{
		boolean expected=service.validateProductPrice(15000);
		boolean actual=true;
		Assert.assertEquals(expected, actual);
	}

	@Test(expected=InvalidProductPriceException.class)
	public void validateProductPriceForInvalidCase()throws InvalidProductPriceException {
		service.validateProductPrice(200);
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



}
