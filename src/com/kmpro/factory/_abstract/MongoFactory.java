package com.kmpro.factory._abstract;

public class MongoFactory implements AbstractFactory {

    @Override
    public UserRepository CreateUser() {
        return new MongodbServerUser();
    }

    @Override
    public DepartmentRepository CreateDepartment() {
        return new MongodbServerDepartment();
    }
}
