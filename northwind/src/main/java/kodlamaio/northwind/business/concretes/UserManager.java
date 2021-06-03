package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(), "Data is listed");
	}

	@Override
	public DataResult<User> findByEmail(String email) {	
		return new SuccessDataResult<User>(this.userDao.findByEmail(email), 
				"User is found");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User added");
	}
	
}
