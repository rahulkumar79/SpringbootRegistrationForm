package com.mahaadev.Registration.dao;

import org.springframework.data.repository.CrudRepository;

import com.mahaadev.Registration.UserRegistration;

public interface UserRepo extends CrudRepository<UserRegistration, Long> {

}
