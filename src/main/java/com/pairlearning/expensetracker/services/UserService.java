package com.pairlearning.expensetracker.services;

import com.pairlearning.expensetracker.exceptions.EtAuthException;
import com.pairlearning.expensetracker.model.User;

public interface UserService { //validate & register a new user

    User validateUser(String email, String password) throws  EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;



}
