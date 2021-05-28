package kodlamaio.HRMS.DataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;

public interface JobPositionsDao extends JpaRepository<Positions,Integer>{
	
	List<Positions> getByJobPosition(String PositionName);
	
	SuccessResult add(Positions positions);

}
