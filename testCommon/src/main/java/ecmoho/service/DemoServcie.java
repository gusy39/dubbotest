package ecmoho.service;



import ecmoho.model.User;

import java.util.List;

/**
 * Created by meidejing on 2017/3/3.
 */
public interface DemoServcie {
    public List<User> getUsers();
    public User getUserByPrimaryKey(String id) ;
}
