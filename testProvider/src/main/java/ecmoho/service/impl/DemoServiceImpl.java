package ecmoho.service.impl;

import ecmoho.model.User;
import ecmoho.service.DemoServcie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meidejing on 2017/3/3.
 */
public class DemoServiceImpl implements DemoServcie{

    public List<User> getUsers() {

        List<User> listUser = new ArrayList<User>();
        User user1 = new User("1","ivan","123456");
        User user2 = new User("2","jack","123456");

        listUser.add(user1);
        listUser.add(user2);

        return listUser;
    }

    public User getUserByPrimaryKey(String id) {
        User user = new User("1","ivan","123456");
        return user;
    }

    public static void main(String[] args) {

    }
}
