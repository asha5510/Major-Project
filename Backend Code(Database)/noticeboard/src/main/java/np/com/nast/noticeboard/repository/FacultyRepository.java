package np.com.nast.noticeboard.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import np.com.nast.noticeboard.entity.Faculty;


@Repository

public interface FacultyRepository extends JpaRepository <Faculty,Long> {
	
}
