package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.Entities.concretes.JobSeekers;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;

public interface JobSeekersService {
	public boolean RegisterStep1(JobSeekers jobseekers);
	public boolean EmailVerification(JobSeekers jobseekers);
	
	
	List<JobSeekers> getAll();
	SuccessResult add(JobSeekers jobSeekers);
	
	DataResult<List<JobSeekers>> getByJobSeekersFirstNameAndJobSeekersLastName(String JSFirstName,String JSLastName);
	DataResult<List<JobSeekers>> getByJobSeekersLogin (String JSEmail,String JSPassword );
		

}
