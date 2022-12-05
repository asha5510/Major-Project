package np.com.nast.noticeboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import np.com.nast.noticeboard.entity.Category;
import np.com.nast.noticeboard.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepo;
	//create
	
	@PostMapping
	public Category createCategory(@RequestBody Category category) {
		return categoryRepo.save(category);
	}
	
	//read all
	@GetMapping
	public List<Category> findAllCategory(){
		return categoryRepo.findAll();
	}
	
	//ready by id
	@GetMapping("/{id}")
	public Optional<Category> findCategory(@PathVariable Long id){
		return categoryRepo.findById(id);
	}
	
	//update
	@PutMapping("/{id}")
	public Category createCategory(@RequestBody Category category, @PathVariable Long id) {
		if(id==category.getId())
		return categoryRepo.save(category);
		
		return null;
	}
	
	//delete
	
	
	//update
		@DeleteMapping("/{id}")
		public void deleteCategory(@PathVariable Long id) {
			
			Optional<Category> oldCat = categoryRepo.findById(id);
			if(oldCat.isPresent()) {
				categoryRepo.deleteById(id);
			}
			
		}

}
