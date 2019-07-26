package com.nami.spring.angularjs.learning.springangularjscurd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nami.spring.angularjs.learning.springangularjscurd.model.User;
import com.nami.spring.angularjs.learning.springangularjscurd.repository.UserRepository;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;
 
	public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return null;
    }
 
 
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
 
    public void saveUser(User user) {
        userRepository.save(user);
    }
 
    public void updateUser(User user){
        saveUser(user);
    }
 
    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
 
    public void deleteAllUsers(){
        userRepository.deleteAll();
    }
 
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
 
    public boolean isUserExist(User user) {
        return findByName(user.getName()) != null;
    }

}
