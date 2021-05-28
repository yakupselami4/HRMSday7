package kodlamaio.HRMS.DataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.HRMS.Entities.concretes.Employers;



public interface EmployersDao extends JpaRepository<Employers,Integer>{
	
	List<Employers> getByCorpName(String CorpName);
	
	List<Employers> getByEmployersShowWebsite(String CorpWebsite);
	
	
	
	

}
