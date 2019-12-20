package comzs.java23_demo.dao;

import comzs.java23_demo.pojo.Classes;
import comzs.java23_demo.pojo.User;

import java.util.List;

public interface Usermapper {
    public List<User> getUserList();
    public List<Classes> getClassList();
    public int getadd(User student);
}
