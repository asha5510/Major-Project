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

import np.com.nast.noticeboard.entity.Faculty;
import np.com.nast.noticeboard.repository.FacultyRepository;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
	 @Autowired
	 private FacultyRepository facultyRepo;
	 
	 //create
	 @PostMapping
	 public Faculty createStudent(@RequestBody Faculty faculty) {
		 return facultyRepo.save(faculty);
	 }
	
	 @GetMapping
	 public List<Faculty> findAllFaculty(){
		 return facultyRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Faculty> findFaculty(@PathVariable Long id){
		 return facultyRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Faculty createFaculty(@RequestBody Faculty faculty,@PathVariable Long id) {
		 if(id==faculty.getId())
			 return facultyRepo.save(faculty);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteFaculty(@PathVariable Long id) {
			
			Optional<Faculty> fac= facultyRepo.findById(id);
			if(fac.isPresent()) {
				facultyRepo.deleteById(id);
			}
			
		}

}
