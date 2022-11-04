package com.mycompany.demo.repositories;

import com.mycompany.demo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Integer> {
    public Long countById(Integer id);
}
