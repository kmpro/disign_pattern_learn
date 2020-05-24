package com.kmpro.factory._abstract;

public class MongodbServerUser implements UserRepository {
    @Override
    public void insert(User user) {
        System.out.println("在Mongodb中插入一条User记录");
    }

    @Override
    public User findByUsername(String username) {
        System.out.println("在Mongodb中根据username得到一条User记录");
        return null;
    }
}
