package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDao = DaoFactory.createSellerDao();

		System.out.println("---Teste 1: SellerById---");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n---Teste 2: FindByDepartment---");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

		System.out.println("\n---Teste 3: FindAll---");
		list = sellerDao.findAll();
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

	}

}
