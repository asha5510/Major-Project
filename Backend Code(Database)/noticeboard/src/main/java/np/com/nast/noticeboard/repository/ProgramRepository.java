package np.com.nast.noticeboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import np.com.nast.noticeboard.entity.Program;

@Repository

public interface ProgramRepository extends JpaRepository <Program,Long> {
	
}
