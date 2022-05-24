package service.work.carrentalclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.model.User;
import service.work.carrentalclub.repos.UserRepo;

import javax.persistence.NoResultException;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user;
        try {
            user = userRepo.findByUserName(username);
        } catch (NoResultException e) {
            throw new UsernameNotFoundException("user not found");
        }
        return user;
    }

    public User findByUserName(String userName) {
        User user;
        try {
            user = userRepo.findByUserName(userName);
        } catch (NoResultException e) {
            throw new UsernameNotFoundException("user not found");
        }
        return  user;
    }
}
