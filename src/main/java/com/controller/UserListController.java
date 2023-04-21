package com.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.SysRole;
import com.pojo.SysUser;
import com.pojo.User;
import com.service.impl.SysRoleServiceImpl;
import com.service.impl.SysUserServiceImpl;
import com.service.impl.UserServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class UserListController {

    @Autowired
    SysUserServiceImpl service;//用户

    @Autowired
    UserServiceImpl userService;//用户

    @Autowired
    SysRoleServiceImpl sysRoleService;//入库信息

    //用户列表页面
    @GetMapping("/UserList")
    public String UserList(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        Page<SysUser> userPage = new Page<>(pn,5);
        Page<SysUser> page = service.page(userPage,null);
        long current = page.getCurrent();
        long pages = page.getPages();
        long total = page.getTotal();
        List<SysUser> records = page.getRecords();
        model.addAttribute("page",page);
        return "sysUser/list";
    }

    //另一个分页
    @GetMapping("/aaa")
    public String aaa(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        PageHelper.startPage(pn,5);
        PageInfo<SysUser> pageInfo = new PageInfo<>(service.Select_aaa());
        model.addAttribute("pageInfo",pageInfo);
        List<SysRole> courses = sysRoleService.list();
        model.addAttribute("courses",courses);
        return "sysUser/list";
    }


    @GetMapping("/search")
    public String search(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model,String queryRealName,Integer queryRoleId){
        PageHelper.startPage(pn,5);
        PageInfo<SysUser> pageInfo = new PageInfo<>(service.Select_Like(queryRealName, queryRoleId));
        model.addAttribute("pageInfo",pageInfo);
        List<SysUser> search=service.Select_Like(queryRealName,queryRoleId);
        List<SysRole> courses = sysRoleService.list();
        System.out.println(courses);
        model.addAttribute("courses",courses);
        model.addAttribute("search",search);
        return "sysUser/list";
    }


    //删除用户方法
    @ResponseBody
    @RequestMapping("/UserDelete")
    public  Boolean RoleDelete(Integer id){
        System.out.println("需要删除的id是"+id);
        return service.removeById(id);//删除成功后的地址
    }

    //查看用户信息方法
    @RequestMapping("/UserView")
    public  String UserView(Integer ID,Model model){
        List<SysUser> UserView =service.Select_ByID(ID);
        model.addAttribute("UserView",UserView);
        return "sysUser/view";
    }

    //修改跳转页面
    @RequestMapping("/UserUpdate")
    public  String UserUpdate(Integer ID, Model model){
        List<SysUser> UserView =service.Select_ByID(ID);

        model.addAttribute("UserUpdate",UserView);
        return "sysUser/update";
    }


    //新增用户
    @RequestMapping("/Chd")
    public  String Chd(Model model,String account,String realName,String password,Integer sex,String birthday,String phone,String address,Integer roleId){
        System.out.println("新增的用户"+account);
        System.out.println("新增的用户角色id是"+roleId);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date time =sdf.parse(birthday);
            System.out.println(time);
            User user = new User(null,account,realName,password,sex,time,phone,address,1L,1L,new Date(),null,null,0);
            userService.save(user);//新添加进去
            System.out.println("新增成功");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return "redirect:aaa";
    }

    //修改提交
    @RequestMapping("/Update_User")
    public  String UserUpdate(String account, String realName,String sex,String both,String phone,String address,String roleId) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date time =sdf.parse(both);

        System.out.println(account);
        System.out.println(time);
        System.out.println(realName);
        System.out.println(both);
        System.out.println(sex);
        System.out.println(phone);
        System.out.println(address);
        System.out.println(roleId);

        return "redirect:aaa";
    }




}
