package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidQuantityException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {
	public static void main(String[] args) throws InvalidProductCodeException, InvalidQuantityException, InvalidProductPriceException, InvalidCategoryException {
		ISaleService service = new SaleService();
		Scanner sc = new Scanner(System.in);
		 		int input=0;
do {			System.out.println("				Billing System");
			System.out.println("1.Register");
			System.out.println("2.Exit");
			input=sc.nextInt();
		switch(input) {
		
		case 1:
				
		System.out.print("Enter the Product Code");
				int productCode = sc.nextInt();
				service.validateProductCode(productCode);
		System.out.println("Enter the quantity");
		int productQuantity=sc.nextInt();
		service.validateProductQuantity(productQuantity);
		System.out.println("Product category");
		String productCategory=sc.next();
		service.validateProductCategory(productCategory);
		System.out.println("Product name");
		String productName=sc.next();
		System.out.println("Product description");
		String productDescription=sc.next();
		System.out.println("Product price");
		int productPrice=sc.nextInt();
		service.validateProductPrice(productPrice);
		LocalDate date = LocalDate.now();
		Sale sale = new Sale(productCode,productQuantity,productCategory,productName,productDescription,productPrice,date);
		System.out.println(service.insertSaleDetails(sale));
		break;
		case 2:
			System.exit(0);
		break;
			default:
		}
	}while(input!=2);
	}
}
