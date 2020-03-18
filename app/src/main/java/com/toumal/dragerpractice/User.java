package com.toumal.dragerpractice;

import javax.inject.Singleton;

@Singleton
public class User {


    private int id;
    private String userName;

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }


}
