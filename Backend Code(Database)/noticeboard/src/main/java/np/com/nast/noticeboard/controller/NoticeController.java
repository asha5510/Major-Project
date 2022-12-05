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

import np.com.nast.noticeboard.entity.Notice;
import np.com.nast.noticeboard.repository.NoticeRepository;


@RestController
@RequestMapping("/notices")
public class NoticeController {
	 @Autowired
	 private NoticeRepository noticeRepo;
	 
	 //create
	 @PostMapping
	 public Notice createNotice(@RequestBody Notice notice) {
		 return noticeRepo.save(notice);
	 }
	
	 @GetMapping
	 public List<Notice> findAllNotice(){
		 return noticeRepo.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Notice> findNotice(@PathVariable Long id){
		 return noticeRepo.findById(id);
	 }
	 
	 @PutMapping("/{id}")
	 public Notice createNotice(@RequestBody Notice notice,@PathVariable Long id) {
		 if(id==notice.getId())
			 return noticeRepo.save(notice);
		 return null;
		 
	 }
	 @DeleteMapping("/{id}")
		public void deleteNotice(@PathVariable Long id) {
			
			Optional<Notice> nl= noticeRepo.findById(id);
			if(nl.isPresent()) {
				noticeRepo.deleteById(id);
			}
			
		}

}

