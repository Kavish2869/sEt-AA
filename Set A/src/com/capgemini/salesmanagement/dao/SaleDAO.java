package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO{
	CollectionUtil util = new CollectionUtil();
	@Override
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) {
		int saleId = util.saleId;
		sale.setSaleId(saleId);
		CollectionUtil.sales.put(saleId, sale);
		return CollectionUtil.sales;
	}

}
