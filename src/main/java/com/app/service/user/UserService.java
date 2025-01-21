package com.app.service.user;

import java.util.List;

import com.app.dto.room.Room;
import com.app.dto.user.User;

public interface UserService {
	
	List<User> findUserList();
	
	int saveUser(User user);
	
	int saveCustomerUser(User user);
	int saveAdminUser(User user);
}
