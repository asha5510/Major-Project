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

import np.com.nast.noticeboard.entity.Role;
import np.com.nast.noticeboard.repository.RoleRepository;


@RestController
@RequestMapping("/roles")
public class RoleController {
	 @Autowired
	 private RoleRepository roleRepo;
	 
	 //create
	 @PostMapping
	 public Role createRole(@RequestBody Role role) {
		 return roleRepo.save(role);
	 }
	
	 @GetMapping
	 public List<Role> findAllRole(){
		 return roleRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Role> findRole(@PathVariable Long id){
		 return roleRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Role createRole(@RequestBody Role role,@PathVariable Long id) {
		 if(id==role.getId())
			 return roleRepo.save(role);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteRole(@PathVariable Long id) {
			
			Optional<Role> rl= roleRepo.findById(id);
			if(rl.isPresent()) {
				roleRepo.deleteById(id);
			}
			
		}

}

