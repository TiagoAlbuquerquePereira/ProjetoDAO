package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDAO DepartmentDao = DaoFactory.createDepartmentDao();
		List <Department> list = new ArrayList<Department>();

		System.out.println("---Teste 1: SellerById---");
		Department dp = DepartmentDao.findById(3);
		System.out.println(dp);

		System.out.println("\n---Teste 2: FindAll---");
		list = DepartmentDao.findAll();
		for (Department dp2 : list) {
			System.out.println(dp2);
		}

		System.out.println("\n---Teste 3: Inset---");
		Department dp3 = new Department(6, "SegurancaDoTrabalho");
		DepartmentDao.insert(dp3);
		System.out.println("New Department: " + dp3.getId());

		System.out.println("\n---Teste 4: Update---");
		dp = DepartmentDao.findById(3);
		dp.setName("Contabilidade");
		DepartmentDao.update(dp);
		System.out.println("Atualização concluída");

		System.out.println("\n---Teste 5: Delete---");
		DepartmentDao.deleteById(7);
		System.out.println("Remoção realizada com sucesso!");
	}

}
