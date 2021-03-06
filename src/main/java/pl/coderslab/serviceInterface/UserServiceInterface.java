package pl.coderslab.serviceInterface;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.User;

import java.util.List;

@Service
public interface UserServiceInterface {

    public List<User> findAllUsers();

    public User findUserById(Long id);

    public User saveUser(User user);

    public User editUser(User user);

    public void deleteUser(Long id);

}
