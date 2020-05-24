package com.kmpro.factory.method;

public interface    UserRepository {

    void insert(User user);

    User findByUsername(String username);

}
