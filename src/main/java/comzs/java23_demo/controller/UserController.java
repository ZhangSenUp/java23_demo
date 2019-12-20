package comzs.java23_demo.controller;

import comzs.java23_demo.pojo.Classes;
import comzs.java23_demo.pojo.User;
import comzs.java23_demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userServiceImpl;
    @RequestMapping("list")
    public String getUserList(Model model ) throws Exception{
        List<User> list=userServiceImpl.getUserList();
        List<Classes> classes=userServiceImpl.getClasses();
        model.addAttribute("list",list);
        model.addAttribute("classes",classes);
        return "list";
    }
    @RequestMapping("add")
    public String add(){
        return "add";
    }
    @RequestMapping("addSave")
    public String addSave(String name,int age,String gender,String telephone,String email,int  classId){
        User student=new User();
        student.setName(name);
        student.setGender(gender);
        student.setAge(age);
        student.setTelephone(telephone);
        student.setEmail(email);
        student.setClassId(classId);
        if(userServiceImpl.add(student)>0){
            return "redirect:/list";
        }
        return "list";
    }

}
