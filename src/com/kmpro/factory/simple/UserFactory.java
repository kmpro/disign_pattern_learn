package com.kmpro.factory.simple;

public class UserFactory {

    public static UserRepository createUser(String db) {
        UserRepository userRepository = null;
        switch (db) {
            case "mysql" :
                userRepository = new MysqlServerUser();
                break;

            case "mongodb" :
                userRepository = new MongodbServerUser();
                break;
        }
        return userRepository;
    }
}
