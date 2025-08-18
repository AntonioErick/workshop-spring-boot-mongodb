package com.erick.workshopmongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erick.workshopmongo.domain.User;
import com.erick.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired //injecao de dependencia automatica do spring
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
