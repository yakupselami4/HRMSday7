package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.EmployersDao;
import kodlamaio.HRMS.Entities.concretes.Employers;
import kodlamaio.HRMS.business.abstracts.EmployersService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;

@Service
public class EmployersServiceManager implements EmployersService{
	
	private EmployersDao employersdao;
	
	@Autowired
	public EmployersServiceManager(EmployersDao employersdao) {
		super();
		this.employersdao=employersdao;
	}

	@Override
	public List<Employers> getAll() {
		return this.employersdao.findAll();
	}

	@Override
	public DataResult<List<Employers>> getByEmployersName(String CorpName) {
		
		return new SuccessDataResult<List<Employers>>(this.employersdao.getByCorpName(CorpName));
	}

	@Override
	public DataResult<List<Employers>> getByEmployersShowWebsite(String CorpWebsite) {
		return new SuccessDataResult<List<Employers>>(this.employersdao.getByEmployersShowWebsite(CorpWebsite));
	}






}
