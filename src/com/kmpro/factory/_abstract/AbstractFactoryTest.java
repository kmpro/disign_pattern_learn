package com.kmpro.factory._abstract;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(0);
        user.setUserName("li");
        user.setAge(18);

        Department dept = new Department();
        dept.setName("Development");

        AbstractFactory abstractFactory1 = new MysqlFactory();
        UserRepository userRepository1 = abstractFactory1.CreateUser();
        userRepository1.insert(user);
        userRepository1.findByUsername("li");
        DepartmentRepository departmentRepository1 = abstractFactory1.CreateDepartment();
        departmentRepository1.insert(dept);
        departmentRepository1.findByDepartmentName("Development");

        AbstractFactory abstractFactory2 = new MongoFactory();
        UserRepository userRepository2 = abstractFactory2.CreateUser();
        userRepository2.insert(user);
        userRepository2.findByUsername("li");
        DepartmentRepository departmentRepository2 = abstractFactory2.CreateDepartment();
        departmentRepository2.insert(dept);
        departmentRepository2.findByDepartmentName("Development");
    }
}
