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

import np.com.nast.noticeboard.entity.Department;
import np.com.nast.noticeboard.repository.DepartmentRepository;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	 @Autowired
	 private DepartmentRepository deptRepo;
	 
	 //create
	 @PostMapping
	 public Department createDepartment(@RequestBody Department dept) {
		 return deptRepo.save(dept);
	 }
	
	 @GetMapping
	 public List<Department> findAllDepartment(){
		 return deptRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Department> findDepartment(@PathVariable Long id){
		 return deptRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Department createDepartment(@RequestBody Department dept,@PathVariable Long id) {
		 if(id==dept.getId())
			 return deptRepo.save(dept);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteDepartment(@PathVariable Long id) {
			
			Optional<Department> dept1= deptRepo.findById(id);
			if(dept1.isPresent()) {
				deptRepo.deleteById(id);
			}
			
		}

}

