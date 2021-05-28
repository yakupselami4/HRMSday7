 package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.JobSeekersDao;
import kodlamaio.HRMS.Entities.concretes.JobSeekers;
import kodlamaio.HRMS.business.abstracts.JobSeekersService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
@Service
public class JobSeekersServiceManager implements JobSeekersService{
	
	private JobSeekersDao jobseekersdao;
	
	@Autowired
	public JobSeekersServiceManager(JobSeekersDao jobseekersdao) {
		super();
		this.jobseekersdao=jobseekersdao;
		
	}

	@Override
	public List<JobSeekers> getAll() {
		return this.jobseekersdao.findAll();
	}

	@Override
	public boolean RegisterStep1(JobSeekers jobseekers) {

		if(jobseekers.getJSEmail().isEmpty()) {
			System.out.println("Email bulunamadı.");
			return false;
		}
		System.out.println("Email sistemde bulundu."+jobseekers.getJSEmail());
		return true;
	}
		
	

	@Override
	public boolean EmailVerification(JobSeekers jobseekers) {
		
		String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat= Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= emailPat.matcher(jobseekers.getJSEmail());
		System.out.println("Email doğrulanması sona erdi."+jobseekers.getJSEmail());
		return matcher.find();
	}

	@Override
	public SuccessResult add(JobSeekers jobSeekers) {
		return (SuccessResult) this.jobseekersdao.findAll();
	}

	@Override
	public DataResult<List<JobSeekers>> getByJobSeekersFirstNameAndJobSeekersLastName(String JSFirstName,
			String JSLastName) {
		return new SuccessDataResult<List<JobSeekers>>(this.jobseekersdao.getByJobSeekersFirstNameAndJobSeekersLastName(JSFirstName, JSLastName));
	}

	@Override
	public DataResult<List<JobSeekers>> getByJobSeekersLogin(String JSEmail, String JSPassword) {
		return new SuccessDataResult<List<JobSeekers>>(this.jobseekersdao.getByJobSeekersLogin(JSEmail, JSPassword));
	}
	
	
	



}
