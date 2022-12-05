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

import np.com.nast.noticeboard.entity.Subject;
import np.com.nast.noticeboard.repository.SubjectRepository;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	 @Autowired
	 private SubjectRepository subRepo;
	 
	 //create
	 @PostMapping
	 public Subject createSubject(@RequestBody Subject sub) {
		 return subRepo.save(sub);
	 }
	
	 @GetMapping
	 public List<Subject> findAllSubject(){
		 return subRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Subject> findSubject(@PathVariable Long id){
		 return subRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Subject createSubject(@RequestBody Subject sub,@PathVariable Long id) {
		 if(id==sub.getId())
			 return subRepo.save(sub);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteSubject(@PathVariable Long id) {
			
			Optional<Subject> sb= subRepo.findById(id);
			if(sb.isPresent()) {
				subRepo.deleteById(id);
			}
			
		}

}
