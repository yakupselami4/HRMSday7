package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;



public interface SystemWorkersService {
	List<SystemWorkers> getAll();
	SuccessResult add(SystemWorkers systemWorkers);
	
	DataResult<List<SystemWorkers>> getBySystemWorkersFirstNameAndSystemWorkersLastName(String SysFirstName, String SysLastName);

}
