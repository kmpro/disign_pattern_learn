package com.kmpro.factory._abstract;

public interface AbstractFactory {

    UserRepository CreateUser();

    DepartmentRepository CreateDepartment();
}
