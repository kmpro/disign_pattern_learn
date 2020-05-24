package com.kmpro.factory.simple;

public interface UserRepository {

    void insert(User user);

    User findByUsername(String username);

}
