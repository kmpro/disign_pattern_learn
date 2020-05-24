package com.kmpro.factory.simple;

public class UserTest {
    public static void main(String[] args) {
        UserRepository userMysqlRepository = UserFactory.createUser("mysql");
        User user = new User();
        user.setId(0);
        user.setUserName("li");
        user.setAge(18);
        userMysqlRepository.insert(user);
        userMysqlRepository.findByUsername("li");

        UserRepository userMongodbRepository = UserFactory.createUser("mongodb");
        userMongodbRepository.insert(user);
        userMongodbRepository.findByUsername("li");
    }
}
