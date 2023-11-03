package product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import product.entity.AddProduct;
import product.service.ProService;
@CrossOrigin("http://localhost:4200")
@RestController
public class ProController {
	@Autowired
	ProService ps;
	@PostMapping("/set")
	public AddProduct set(@RequestBody AddProduct a) {
		 
		 return ps.set(a);
	}
	@GetMapping("/getAll")
	public List<AddProduct> getall() {
		return ps.getall();
	}

}
