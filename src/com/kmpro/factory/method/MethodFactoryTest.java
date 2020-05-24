package com.kmpro.factory.method;

public class MethodFactoryTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(0);
        user.setUserName("li");
        user.setAge(18);

        MethodFactory dbFactory1 = new UserMysqlFactory();
        UserRepository userRepository = dbFactory1.CreateUser();
        userRepository.insert(user);
        userRepository.findByUsername("li");

        MethodFactory dbFactory2 = new UserMongoFactory();
        UserRepository userMongodbRepository = dbFactory2.CreateUser();
        userMongodbRepository.insert(user);
        userMongodbRepository.findByUsername("li");
    }
}
