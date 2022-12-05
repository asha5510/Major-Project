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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	
	private Integer wardNumber;
	private String houseNumber;
	private String tole;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="municipality_id")
	private Municipality municipality;
	
	@ManyToOne
	@JoinColumn(name="program_id")
	private Program program;
	
	@OneToMany(mappedBy = "student")
	private List<StudentSemester> studentSemesters = new ArrayList<>();
	
	public Student() {
		super();
	}
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

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
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
	public Municipality getMunicipality() {
		return municipality;
	}
	public void setMunicipality(Municipality municipality) {
		this.municipality = municipality;
	}
	public List<StudentSemester> getStudentSemesters() {
		return studentSemesters;
	}
	public void setStudentSemesters(List<StudentSemester> studentSemesters) {
		this.studentSemesters = studentSemesters;
	}
		
}
