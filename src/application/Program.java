package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {


		Department dp = new Department(1, "Tiago Albuquerque");
		System.out.println(dp);
		
		Seller seller = new Seller(1, "joão", "joao@gmail.com", new Date(), 3000.0, dp);
		System.out.println(seller);

	}
 
}
