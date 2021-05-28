package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;

public interface JobPositionService {
	
	List<Positions> getAll();
	SuccessResult add(Positions positions);
	
	DataResult<List<Positions>> getByJobPosition(String PositionName);
	

}
