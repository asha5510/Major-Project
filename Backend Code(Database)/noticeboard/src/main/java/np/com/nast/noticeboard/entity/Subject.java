package np.com.nast.noticeboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_subjects")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String subname;
	private String subcode;
	private long credithour;
	
	@OneToOne
	@JoinColumn(name="program_id")
	private Program program;

	@OneToOne
	@JoinColumn(name="semester_id")
	private Semester semester;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getSubcode() {
		return subcode;
	}
	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}
	public long getCredithour() {
		return credithour;
	}
	public void setCredithour(long credithour) {
		this.credithour = credithour;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public Semester getSemester() {
		return semester;
	}
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	
	

}
