package np.com.nast.noticeboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_teachers")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="municipality_id")
	private Municipality municipality;
	
	private Integer wardNumber;
	private String houseNumber;
	private String tole;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Municipality getMunicipality() {
		return municipality;
	}
	public void setMunicipality(Municipality municipality) {
		this.municipality = municipality;
	}
	public Integer getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(Integer wardNumber) {
		this.wardNumber = wardNumber;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getTole() {
		return tole;
	}
	public void setTole(String tole) {
		this.tole = tole;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
