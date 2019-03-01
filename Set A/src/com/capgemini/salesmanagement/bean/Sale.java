package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
	
	private int saleId,quantity;
	int prodCode;
	private String productName,cateogery;
	private LocalDate saleDate;
	private String description;
	private int productPrice;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Sale \n saleId=" + saleId + "\n prodCode=" + prodCode + "\n quantity=" + quantity + "\n productName="
				+ productName + "\n cateogery=" + cateogery + "\n saleDate=" + saleDate + "\n description=" + description
				+ "\n productPrice=" + productPrice + "\n lineTotal=" + lineTotal;
	}
	private float lineTotal;
	public Sale() {
		super();
	}
		
     @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cateogery == null) ? 0 : cateogery.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + Float.floatToIntBits(lineTotal);
		result = prime * result + prodCode;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		result = prime * result + quantity;
		result = prime * result + ((saleDate == null) ? 0 : saleDate.hashCode());
		result = prime * result + saleId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (cateogery == null) {
			if (other.cateogery != null)
				return false;
		} else if (!cateogery.equals(other.cateogery))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Float.floatToIntBits(lineTotal) != Float.floatToIntBits(other.lineTotal))
			return false;
		if (prodCode != other.prodCode)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		if (quantity != other.quantity)
			return false;
		if (saleDate == null) {
			if (other.saleDate != null)
				return false;
		} else if (!saleDate.equals(other.saleDate))
			return false;
		if (saleId != other.saleId)
			return false;
		return true;
	}
	public Sale(int productCode, int productQuantity, String productCategory, String productName,
			String productDescription, int productPrice, LocalDate date) {
		
		this.prodCode=productCode;
		this.cateogery=productCategory;
		this.quantity=productQuantity;
		this.productName=productName;
		this.description=productDescription;
		this.productPrice=productPrice;
		this.saleDate =date;
	}
	
	
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int  getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCateogery() {
		return cateogery;
	}
	public void setCateogery(String cateogery) {
		this.cateogery = cateogery;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
}
	

