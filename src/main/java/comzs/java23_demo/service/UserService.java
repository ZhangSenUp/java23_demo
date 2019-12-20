package comzs.java23_demo.service;

import comzs.java23_demo.pojo.Classes;
import comzs.java23_demo.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();
    public List<Classes> getClasses();
    public int add(User student);
}
