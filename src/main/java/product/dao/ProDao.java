package product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import product.entity.AddProduct;
import product.repository.ProRepository;
@Repository
public class ProDao {
@Autowired
ProRepository pr;
	public AddProduct set(AddProduct a) {
		
		return  pr.save(a);
		 
		 
	}
	public List<AddProduct> getall() {
		
		return pr.findAll();
	}

}
