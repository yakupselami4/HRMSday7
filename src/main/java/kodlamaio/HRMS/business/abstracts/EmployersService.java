package kodlamaio.HRMS.business.abstracts;

import java.util.List;


import kodlamaio.HRMS.Entities.concretes.Employers;
import kodlamaio.HRMS.core.utilities.results.DataResult;



public interface EmployersService {
	List<Employers> getAll();
	//DataResult add(Employers employers);
	
	DataResult<List<Employers>> getByEmployersName(String CorpName);
	
	DataResult<List<Employers>> getByEmployersShowWebsite(String CorpWebsite);
	


}
