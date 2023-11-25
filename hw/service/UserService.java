package service;

import data.User;
import java.util.List;

public interface UserService <T extends User> {
    void create (String firstName, String secondName, String lastName);
    List<T> getAll();
    
}
