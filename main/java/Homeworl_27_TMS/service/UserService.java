package Homeworl_27_TMS.service;

import Homeworl_27_TMS.entity.User;

import Homeworl_27_TMS.storage.UserStorage;

public class UserService {
	private UserStorage userStorage = new UserStorage();

	public boolean add(User user){
		if (userStorage.existByUsername(user.getUsername())){
			return false;
		} else {
			userStorage.save(user);
			return true;
		}
	}

	public User findByUsername(String username){
		if (userStorage.existByUsername(username)){
			return userStorage.getByUsername(username);
		}
		return null;
	}
}
