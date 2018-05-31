package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.User;
import pl.coderslab.repository.UserRepository;
import pl.coderslab.serviceInterface.UserServiceInterface;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElseGet(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User editUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
