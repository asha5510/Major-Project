package np.com.nast.noticeboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import np.com.nast.noticeboard.entity.StudentSemester;

@Repository

public interface StudentSemesterRepository extends JpaRepository <StudentSemester,Long> {
	
}
