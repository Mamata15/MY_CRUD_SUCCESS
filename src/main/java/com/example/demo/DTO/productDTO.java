package com.example.demo.DTO;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class productDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	
	private String productname;
	private int product_price;
	private String product_Description;
	private int product_Quantity;

	public int getProduct_Quantity() {
		return product_Quantity;
	}

	public void setProduct_Quantity(int product_Quantity) {
		this.product_Quantity = product_Quantity;
	}

	public String getProduct_name() {
		return productname;
	}

	public void setProduct_name(String productname) {
		this.productname = productname;
	}
	
	public String getproduct_Desciption() {
		return product_Description;
	}
	
	public void setproduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "productDTO [productname=" + productname + ", product_id=" + product_id + ", product_price="
				+ product_price + ", product_Description=" + product_Description + ", product_Quantity=" + product_Quantity + "]";
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_Description() {
		return product_Description;
	}

	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}

	public productDTO(String productname, int product_id, int product_price, String product_Description,int product_Quantity) {
		super();
		this.productname = productname;
		this.product_id = product_id;
		this.product_price = product_price;
		this.product_Description = product_Description;
		this.product_Quantity= product_Quantity;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public productDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
