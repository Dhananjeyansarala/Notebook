package product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.dao.ProDao;
import product.entity.AddProduct;
@Service
public class ProService {
	@Autowired
	ProDao pd;

	public AddProduct set(AddProduct a) {
		
		return pd.set(a);
	}

	public List<AddProduct> getall() {
		
		return pd.getall();
	}

}
