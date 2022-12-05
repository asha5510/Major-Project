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

import np.com.nast.noticeboard.entity.Student;
import np.com.nast.noticeboard.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	 @Autowired
	 private StudentRepository studentRepo;
	 
	 //create
	 @PostMapping
	 public Student createStudent(@RequestBody Student student) {
		 return studentRepo.save(student);
	 }
	
	 @GetMapping
	 public List<Student> findAllStudent(){
		 return studentRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Student> findStudent(@PathVariable Long id){
		 return studentRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Student createStudent(@RequestBody Student student,@PathVariable Long id) {
		 if(id==student.getId())
			 return studentRepo.save(student);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteStudent(@PathVariable Long id) {
			
			Optional<Student> std= studentRepo.findById(id);
			if(std.isPresent()) {
				studentRepo.deleteById(id);
			}
			
		}

}
