package kodlamaio.HRMS.DataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.SystemWorkers;

public interface SystemWorkersDao extends JpaRepository<SystemWorkers, Integer>{
	
	List<SystemWorkers> getBySystemWorkersFirstNameAndSystemWorkersLastName(String SysFirstName, String SysLastName);

}
