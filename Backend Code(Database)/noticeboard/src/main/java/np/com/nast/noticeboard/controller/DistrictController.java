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

import np.com.nast.noticeboard.entity.District;
import np.com.nast.noticeboard.repository.DistrictRepository;

@RestController
@RequestMapping("/districts")
public class DistrictController {
	
			 @Autowired
		 private DistrictRepository districtRepo;
		 
		 //create
		 @PostMapping
		 public District createDistrict(@RequestBody District district) {
			 return districtRepo.save(district);
		 }
		
		 @GetMapping
		 public List<District> findAllDistrict(){
			 return districtRepo.findAll();
		 }
		 
		 @GetMapping("/{id}")
		 public Optional<District> findDistrict(@PathVariable Long id){
			 return districtRepo.findById(id);
		 }
		 
		 @PutMapping("/{id}")
		 public District createDistrict(@RequestBody District district,@PathVariable Long id) {
			 if(id==district.getId())
				 return districtRepo.save(district);
			 return null;
			 
		 }
		 @DeleteMapping("/{id}")
			public void deleteDistrict(@PathVariable Long id) {
				
				Optional<District> dis= districtRepo.findById(id);
				if(dis.isPresent()) {
					districtRepo.deleteById(id);
				}
				
			}

	}
