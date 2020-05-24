package com.kmpro.factory.method;

public class UserMysqlFactory implements MethodFactory {

    @Override
    public UserRepository CreateUser() {
        return new MysqlServerUser();
    }
}
