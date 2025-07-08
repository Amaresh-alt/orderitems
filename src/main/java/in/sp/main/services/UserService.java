package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import in.sp.main.entities.User;

public interface UserService {
	void deleteUser(int id);

    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserDetails(int id);

    User updateUserDetails(int id, User user);
}

