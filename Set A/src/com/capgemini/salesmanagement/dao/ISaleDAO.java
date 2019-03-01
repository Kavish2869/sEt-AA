package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import com.capgemini.salesmanagement.bean.Sale;

public interface ISaleDAO {
	public HashMap<Integer,Sale> insertSaleDetails(Sale sale);
}
