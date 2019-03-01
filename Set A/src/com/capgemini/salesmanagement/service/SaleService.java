package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import javax.naming.InvalidNameException;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exceptions.InvalidCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidQuantityException;

public class SaleService implements ISaleService {
	ISaleDAO serviceDAO = new SaleDAO();
	//Sale sale=new Sale();

	@Override
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale){
		int lineTotal = sale.getProductPrice() * sale.getQuantity();
		sale.setLineTotal(lineTotal);
	return serviceDAO.insertSaleDetails(sale);
	}
	@Override
	public boolean validateProductCode(int productId) throws InvalidProductCodeException {
          
		if(productId==1001||productId==1002||productId==1003||productId==1004)
			return true;
     throw new InvalidProductCodeException("Enter correct");
	}
	@Override
	public boolean validateProductCategory(String prodCat) throws InvalidCategoryException {
		if(prodCat.equalsIgnoreCase("Electronics")||prodCat.equalsIgnoreCase("Toys"))
		return true;
     throw new InvalidCategoryException("Enter correct category");
	}
	@Override
	public boolean validateProductName(String prodName) throws InvalidNameException {
if(prodName.equalsIgnoreCase("SmartPhone")||prodName.equalsIgnoreCase("VideoGame")||prodName.equalsIgnoreCase("SoftToy")||prodName.equalsIgnoreCase("Telescope"))
		return true;
throw new InvalidNameException("Enter valid name");
	}
	@Override
	public boolean validateProductPrice(float price) throws InvalidProductPriceException {
	if(price>200)
	return true;
		else 
		throw new  InvalidProductPriceException("enter amount above 200") ;
	}
	@Override
	public boolean validateProductQuantity(float qty) throws InvalidQuantityException {
		if(qty>0&&qty<5)
			return true;
		else
			throw new InvalidQuantityException("Invalid ");
		
	}
}
