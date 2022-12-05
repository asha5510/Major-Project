package np.com.nast.noticeboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.com.nast.noticeboard.entity.Province;

public interface ProvinceRepository extends JpaRepository <Province,Long> {

}
