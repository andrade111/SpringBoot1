package projeto.sb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.sb.entities.Product;
import projeto.sb.service.ProductService;

@RestController
@RequestMapping(value = "/categories")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List <Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<Product> findById(@PathVariable long Id) {
		Product obj = service.findById(Id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}