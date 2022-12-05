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

import np.com.nast.noticeboard.entity.Teacher;
import np.com.nast.noticeboard.repository.TeacherRepository;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
			 @Autowired
		 private TeacherRepository teacherRepo;
		 
		 //create
		 @PostMapping
		 public Teacher createTeacher(@RequestBody Teacher teacher) {
			 return teacherRepo.save(teacher);
		 }
		
		 @GetMapping
		 public List<Teacher> findAllTeacher(){
			 return teacherRepo.findAll();
		 }
		 
		 @GetMapping("/{id}")
		 public Optional<Teacher> findTeacher(@PathVariable Long id){
			 return teacherRepo.findById(id);
		 }
		 
		 @PutMapping("/{id}")
		 public Teacher createTeacher(@RequestBody Teacher teacher,@PathVariable Long id) {
			 if(id==teacher.getId())
				 return teacherRepo.save(teacher);
			 return null;
			 
		 }
		 @DeleteMapping("/{id}")
			public void deleteTeacher(@PathVariable Long id) {
				
				Optional<Teacher> tech= teacherRepo.findById(id);
				if(tech.isPresent()) {
					teacherRepo.deleteById(id);
				}
				
			}

	}
