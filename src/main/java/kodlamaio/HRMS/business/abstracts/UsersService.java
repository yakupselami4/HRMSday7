package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.Entities.concretes.Users;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;


public interface UsersService {
	List<Users> getAll();
	SuccessResult add(Users users);

}
