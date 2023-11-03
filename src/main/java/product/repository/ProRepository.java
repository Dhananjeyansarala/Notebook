package product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import product.entity.AddProduct;

public interface ProRepository extends JpaRepository<AddProduct, Integer>{

}
