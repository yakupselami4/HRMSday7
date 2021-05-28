package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.Entities.concretes.Employers;
import kodlamaio.HRMS.Entities.concretes.JobSeekers;
import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.business.abstracts.EmployersService;
import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.business.abstracts.JobSeekersService;
import kodlamaio.HRMS.business.abstracts.SystemWorkersService;
import kodlamaio.HRMS.core.utilities.results.DataResult;

@RestController
@RequestMapping("/api")
public class UsersController {
	
	private EmployersService employersservice;
	private JobPositionService jobpositionservice;
	private SystemWorkersService systemworkersservice;
	private JobSeekersService jobseekersservice;
	
	@GetMapping("/getEmployerName")
	public DataResult<List<Employers>> getEmployerName(String CorpName){
		return this.employersservice.getByEmployersName(CorpName);
	}
	@GetMapping("/showEmployerWebsite")
	public DataResult<List<Employers>> showEmployerWebsite(String CorpWebsite){
		return this.employersservice.getByEmployersShowWebsite(CorpWebsite);
	}
	
	
	@GetMapping("/getJobPosition")
	public DataResult<List<Positions>> getByJobPosition(String PositionName){
		return this.jobpositionservice.getByJobPosition(PositionName);
	}
	
	@GetMapping("/showJobSeekersProfile")
	public DataResult<List<JobSeekers>> getByJobSeekersFirstNameAndJobSeekersLastName(String JSFirstName,String JSLastName){
		return this.jobseekersservice.getByJobSeekersFirstNameAndJobSeekersLastName(JSFirstName, JSLastName);
	}
	@GetMapping("/JobSeekersLogin")
	public DataResult<List<JobSeekers>> getByJobSeekersLogin (String JSEmail,String JSPassword ){
		return this.jobseekersservice.getByJobSeekersLogin(JSEmail, JSPassword);
	}
	
	@GetMapping("/showSystemWorkersProfile")
	public DataResult<List<SystemWorkers>> getBySystemWorkersFirstNameAndSystemWorkersLastName(String SysFirstName, String SysLastName){
		return this.systemworkersservice.getBySystemWorkersFirstNameAndSystemWorkersLastName(SysFirstName, SysLastName);
	}
	
	
	
	
	

}
