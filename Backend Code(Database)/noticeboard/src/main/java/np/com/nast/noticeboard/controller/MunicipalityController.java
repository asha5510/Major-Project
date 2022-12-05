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

import np.com.nast.noticeboard.entity.Municipality;
import np.com.nast.noticeboard.repository.MunicipalityRepository;

@RestController
@RequestMapping("/municipalities")
public class MunicipalityController {
	
			 @Autowired
		 private MunicipalityRepository munRepo;
		 
		 //create
		 @PostMapping
		 public Municipality createMunicipality(@RequestBody Municipality municipality) {
			 return munRepo.save(municipality);
		 }
		
		 @GetMapping
		 public List<Municipality> findAllMunicipality(){
			 return munRepo.findAll();
		 }
		 
		 @GetMapping("/{id}")
		 public Optional<Municipality> findMunicipality(@PathVariable Long id){
			 return munRepo.findById(id);
		 }
		 
		 @PutMapping("/{id}")
		 public Municipality createMunicipality(@RequestBody Municipality municipality,@PathVariable Long id) {
			 if(id==municipality.getId())
				 return munRepo.save(municipality);
			 return null;
			 
		 }
		 @DeleteMapping("/{id}")
			public void deleteMunicipality(@PathVariable Long id) {
				
				Optional<Municipality> mun= munRepo.findById(id);
				if(mun.isPresent()) {
					munRepo.deleteById(id);
				}
				
			}

	}
