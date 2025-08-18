package com.erick.workshopmongo.resources;

import java.util.List;
import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erick.workshopmongo.domain.User;
import com.erick.workshopmongo.service.Autowired;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @Autowired
    private UserSerive service;
    
    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        
        List<User> list = service.findAll;
        return ResponseEntity.ok().body(list);
    }
}
