package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.JobPositionsDao;
import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;

@Service
public class JobPositionsManager implements JobPositionService{
	
	private JobPositionsDao jobpositionsdao;
	
	public JobPositionsManager(JobPositionsDao jobpositionsdao) {
		super();
		this.jobpositionsdao = jobpositionsdao;
		
	}

	@Override
	public List<Positions> getAll() {
		
		return this.jobpositionsdao.findAll();
	}

	@Override
	public SuccessResult add(Positions positions) {
		return(SuccessResult) this.jobpositionsdao.findAll();
	}

	@Override
	public DataResult<List<Positions>> getByJobPosition(String PositionName) {
		return new SuccessDataResult<List<Positions>>(this.jobpositionsdao.getByJobPosition(PositionName));
	}

}
