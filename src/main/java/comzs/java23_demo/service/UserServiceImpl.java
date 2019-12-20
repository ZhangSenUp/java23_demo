package comzs.java23_demo.service;

import comzs.java23_demo.dao.Usermapper;
import comzs.java23_demo.pojo.Classes;
import comzs.java23_demo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private Usermapper usermapper;
    @Override
    public List<User> getUserList() {
        return usermapper.getUserList();
    }

    @Override
    public List<Classes> getClasses() {
        return usermapper.getClassList();
    }

    @Override
    public int add(User student) {
        return usermapper.getadd(student);
    }
}
