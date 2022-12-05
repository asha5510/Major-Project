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

import np.com.nast.noticeboard.entity.StudentSemester;
import np.com.nast.noticeboard.repository.StudentSemesterRepository;

@RestController
@RequestMapping("/studentsemesters")
public class StudentSemesterController {
	 @Autowired
	 private StudentSemesterRepository ssRepo;
	 
	 //create
	 @PostMapping
	 public StudentSemester createStudentSemester(@RequestBody StudentSemester ss) {
		 return ssRepo.save(ss);
	 }
	
	 @GetMapping
	 public List<StudentSemester> findAllStudentSemester(){
		 return ssRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<StudentSemester> findStudentSemester(@PathVariable Long id){
		 return ssRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public StudentSemester createStudentSemester(@RequestBody StudentSemester ss,@PathVariable Long id) {
		 if(id==ss.getId())
			 return ssRepo.save(ss);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteStudentSemester(@PathVariable Long id) {
			
			Optional<StudentSemester> ss1= ssRepo.findById(id);
			if(ss1.isPresent()) {
				ssRepo.deleteById(id);
			}
			
		}

}
