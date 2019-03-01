package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {
	
	public static HashMap<Integer,Sale> sales = new HashMap<Integer,Sale>();
	public static HashMap<Integer,Sale> getCollection(){
		return sales;
	}
	public int saleId= (int) ((Math.random()*10000-1));
	
}
