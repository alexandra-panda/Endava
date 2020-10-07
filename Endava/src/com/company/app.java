package com.company;

import java.util.ArrayList;
import java.util.List;


public class app {

    public static void main(String[] args) {

        List<User> registUser = new ArrayList<>();

        registUser.add(new User("Damean", "Alexandra", 21,"alexandra.damean@ee.utm.md"
                ,Status.New,"1 10 2020"));
        registUser.add(new User("Culev", "Sergiu", 24,"culev.sergiu@ee.utm.md"
                ,Status.New,"28 06 2020"));

        for (User user: registUser) {
            user.changeStatus();
            System.out.println(user);

        }

    }

