package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.SystemWorkersDao;
import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.business.abstracts.SystemWorkersService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
@Service
public class SystemWorkersServiceManager implements SystemWorkersService{
	
	private SystemWorkersDao systemworkersdao;
	
	@Autowired
	public SystemWorkersServiceManager(SystemWorkersDao systemworkersdao) {
		super();
		this.systemworkersdao=systemworkersdao;
		
	}
	
	

	@Override
	public List<SystemWorkers> getAll() {

		return this.systemworkersdao.findAll();
	}



	@Override
	public SuccessResult add(SystemWorkers systemWorkers) {
		return (SuccessResult) this.systemworkersdao.findAll();
	}



	@Override
	public DataResult<List<SystemWorkers>> getBySystemWorkersFirstNameAndSystemWorkersLastName(String SysFirstName,
			String SysLastName) {
		return new SuccessDataResult<List<SystemWorkers>>(this.systemworkersdao.getBySystemWorkersFirstNameAndSystemWorkersLastName(SysFirstName,SysLastName));
	}

}
