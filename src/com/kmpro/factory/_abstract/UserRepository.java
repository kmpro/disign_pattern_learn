package com.kmpro.factory._abstract;

public interface    UserRepository {

    void insert(User user);

    User findByUsername(String username);

}
