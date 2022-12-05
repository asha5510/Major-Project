
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

import np.com.nast.noticeboard.entity.Program;
import np.com.nast.noticeboard.repository.ProgramRepository;

@RestController
@RequestMapping("/programs")
public class ProgramController {
	 @Autowired
	 private ProgramRepository proRepo;
	 
	 //create
	 @PostMapping
	 public Program createProgram(@RequestBody Program prog) {
		 return proRepo.save(prog);
	 }
	
	 @GetMapping
	 public List<Program> findAllProgram(){
		 return proRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Program> findProgram(@PathVariable Long id){
		 return proRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Program createProgram(@RequestBody Program pro,@PathVariable Long id) {
		 if(id==pro.getId())
			 return proRepo.save(pro);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteProgram(@PathVariable Long id) {
			
			Optional<Program> pg= proRepo.findById(id);
			if(pg.isPresent()) {
				proRepo.deleteById(id);
			}
			
		}

}

