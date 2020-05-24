package com.kmpro.factory.method;

public class UserMongoFactory implements MethodFactory {

    @Override
    public UserRepository CreateUser() {
        return new MongodbServerUser();
    }
}
