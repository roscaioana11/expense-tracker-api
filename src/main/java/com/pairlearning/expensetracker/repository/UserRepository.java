package com.pairlearning.expensetracker.repository;

import com.pairlearning.expensetracker.exceptions.EtAuthException;
import com.pairlearning.expensetracker.model.User;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);

}
