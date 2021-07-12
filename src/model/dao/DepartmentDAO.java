package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface DepartmentDAO {

	void insert(Department dp);

	void update(Department  dp);

	void deleteById(Integer id);

	Department findById(Integer id);

	List<Department > findAll();


}
