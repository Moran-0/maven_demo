package com.moran.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDapImp implements UserDao{
    @Override
    public void select() {
        System.out.println("selecting");
    }

    @Override
    public void add() {
        System.out.println("adding");
    }
}
