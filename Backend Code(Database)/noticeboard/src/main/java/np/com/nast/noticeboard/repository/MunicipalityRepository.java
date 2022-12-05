package np.com.nast.noticeboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.com.nast.noticeboard.entity.Municipality;

public interface MunicipalityRepository extends JpaRepository <Municipality,Long> {

}
