package com.baccredomatic.auth.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baccredomatic.auth.domain.User;



@Repository
public interface UsersRepository extends CrudRepository<User, String> {


}
