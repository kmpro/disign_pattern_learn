package com.kmpro.factory._abstract;

public interface DepartmentRepository {
    void insert(Department dept);

    Department findByDepartmentName(String deptName);
}
