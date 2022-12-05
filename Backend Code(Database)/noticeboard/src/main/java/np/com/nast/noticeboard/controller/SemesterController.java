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

import np.com.nast.noticeboard.entity.Semester;
import np.com.nast.noticeboard.repository.SemesterRepository;

@RestController
@RequestMapping("/semesters")
public class SemesterController {
	 @Autowired
	 private SemesterRepository semRepo;
	 
	 //create
	 @PostMapping
	 public Semester createSemester(@RequestBody Semester semester) {
		 return semRepo.save(semester);
	 }
	
	 @GetMapping
	 public List<Semester> findAllSemester(){
		 return semRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Semester> findSemester(@PathVariable Long id){
		 return semRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Semester createSemester(@RequestBody Semester semester,@PathVariable Long id) {
		 if(id==semester.getId())
			 return semRepo.save(semester);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteSemester(@PathVariable Long id) {
			
			Optional<Semester> sm= semRepo.findById(id);
			if(sm.isPresent()) {
				semRepo.deleteById(id);
			}
			
		}

}
