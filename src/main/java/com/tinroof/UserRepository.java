package com.tinroof;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brett on 12/21/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
	User findByEmail(String email);
}
