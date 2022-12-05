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

import np.com.nast.noticeboard.entity.User;
import np.com.nast.noticeboard.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	 @Autowired
	 private UserRepository userRepo;
	 
	 //create
	 @PostMapping
	 public User createUser(@RequestBody User user) {
		 return userRepo.save(user);
	 }
	
	 @GetMapping
	 public List<User> findAllDUser(){
		 return userRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<User> findUser(@PathVariable Long id){
		 return userRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public User createDepartment(@RequestBody User user,@PathVariable Long id) {
		 if(id==user.getId())
			 return userRepo.save(user);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteUser(@PathVariable Long id) {
			
			Optional<User> us= userRepo.findById(id);
			if(us.isPresent()) {
				userRepo.deleteById(id);
			}
			
		}

}


