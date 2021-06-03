package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

public interface UserService {
	
	DataResult<List<User>> getAll();
	
	DataResult<User> findByEmail(String email);

	Result add(User user);
	
}
