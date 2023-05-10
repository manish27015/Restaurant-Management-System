package springmvc_controller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int Id;
	public String productname;
	public String productdescription;
	public String price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public user(int id, String productname, String productdescription, String price) {
		super();
		Id = id;
		this.productname = productname;
		this.productdescription = productdescription;
		this.price = price;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "user [Id=" + Id + ", productname=" + productname + ", productdescription=" + productdescription
				+ ", price=" + price + "]";
	}
	
	

}
