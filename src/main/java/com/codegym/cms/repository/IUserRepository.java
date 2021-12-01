package com.codegym.cms.repository;

import com.codegym.cms.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface IUserRepository extends PagingAndSortingRepository<User, Long> {

}
