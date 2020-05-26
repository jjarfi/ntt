package com.jjarfi.github.ntt.Controller;

import com.jjarfi.github.ntt.Repository.RepositoryAdmin;
import com.jjarfi.github.ntt.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class IndexController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private RepositoryAdmin reposadmin;

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public ModelAndView displayRegistration(ModelAndView modelAndView, DaoAdmin admin) {
//        modelAndView.addObject("masuk", admin);
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }
//    @GetMapping({"/", "/login"})
//    public String getLogin(){
//        return "login";
//    }
//
//    @PostMapping("/login")
//    public String getName(ModelMap modelMap, DaoAdmin admin){
//        modelMap.addAttribute("loginForm", admin);
//        DaoAdmin uname = adminService.getLogin(admin.getUsername(), admin.getPassword());
//        System.out.println(uname);
//        if (uname != null){
//            return "redirect:/home";
//        }
//        return "login";
//    }
}

