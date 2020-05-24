package com.kmpro.factory._abstract;

public class MysqlFactory implements AbstractFactory {

    @Override
    public UserRepository CreateUser() {
        return new MysqlServerUser();
    }

    @Override
    public DepartmentRepository CreateDepartment() {
        return new MysqlServerDepartment();
    }
}
