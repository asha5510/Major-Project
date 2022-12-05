package np.com.nast.noticeboard.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_municipalities")
public class Municipality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String municiname;
	
	@OneToMany(mappedBy = "municipality")
	private List<Student> students = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "municipality")
	private List<Teacher> teachers = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="district_id")
	private District district;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMuniciname() {
		return municiname;
	}
	public void setMuniciname(String municiname) {
		this.municiname = municiname;
	}
	
	
}
