package kodlamaio.HRMS.DataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer>
{
	List<JobSeekers> getByJobSeekersFirstNameAndJobSeekersLastName(String JSFirstName,String JSLastName );
	
	List<JobSeekers> getByJobSeekersLogin (String JSEmail,String JSPassword );

}
