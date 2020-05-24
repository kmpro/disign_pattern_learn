package com.kmpro.factory.method;

public class MysqlServerUser implements UserRepository {

    @Override
    public void insert(User user) {
        System.out.println("在Mysql中插入一条User记录");
    }

    @Override
    public User findByUsername(String username) {
        System.out.println("在Mysql中根据username得到一条User记录");
        return null;
    }
}
