package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import javax.naming.InvalidNameException;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidQuantityException;

public interface ISaleService {
	public HashMap<Integer,Sale> insertSaleDetails(Sale sale) throws InvalidProductCodeException;
	public boolean validateProductCode(int productId)throws InvalidProductCodeException;
	public boolean validateProductCategory(String prodCat) throws InvalidCategoryException;
	public boolean validateProductName(String prodName) throws InvalidNameException;
	public boolean validateProductPrice(float price) throws InvalidProductPriceException;
	public boolean validateProductQuantity(float qty)throws InvalidQuantityException;
}
