package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO {

	void insert(Seller dp);

	void update(Seller dp);

	void deleteById(Integer id);

	Seller findById(Integer id);

	List<Seller> findAll();

}
