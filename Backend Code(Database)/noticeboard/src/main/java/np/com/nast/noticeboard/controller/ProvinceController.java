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

import np.com.nast.noticeboard.entity.Province;
import np.com.nast.noticeboard.repository.ProvinceRepository;

@RestController
@RequestMapping("/provinces")
public class ProvinceController {
	
			 @Autowired
		 private ProvinceRepository provinceRepo;
		 
		 //create
		 @PostMapping
		 public Province createProvince(@RequestBody Province province) {
			 return provinceRepo.save(province);
		 }
		
		 @GetMapping
		 public List<Province> findAllProvince(){
			 return provinceRepo.findAll();
		 }
		 
		 @GetMapping("/{id}")
		 public Optional<Province> findProvince(@PathVariable Long id){
			 return provinceRepo.findById(id);
		 }
		 
		 @PutMapping("/{id}")
		 public Province createProvince(@RequestBody Province province,@PathVariable Long id) {
			 if(id==province.getId())
				 return provinceRepo.save(province);
			 return null;
			 
		 }
		 @DeleteMapping("/{id}")
			public void deleteProvince(@PathVariable Long id) {
				
				Optional<Province> prov= provinceRepo.findById(id);
				if(prov.isPresent()) {
					provinceRepo.deleteById(id);
				}
				
			}

	}
