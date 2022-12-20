package in.bushansirgur.springbootthymeleaf.dao;

import in.bushansirgur.springbootthymeleaf.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
