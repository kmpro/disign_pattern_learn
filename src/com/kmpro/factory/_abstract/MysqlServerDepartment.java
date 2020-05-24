package com.kmpro.factory._abstract;

public class MysqlServerDepartment implements DepartmentRepository {

    @Override
    public void insert(Department dept) {
        System.out.println("在Mysql中插入一条Department记录");
    }

    @Override
    public Department findByDepartmentName(String deptName) {
        System.out.println("在Mysql中根据deptName得到一条Department记录");
        return null;
    }
}
