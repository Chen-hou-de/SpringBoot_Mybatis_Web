package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.StorageRecord;
import com.pojo.Supplier;
import com.pojo.SysRole;
import com.pojo.SysUser;
import com.service.impl.StorageRecordServiceImpl;
import com.service.impl.SupplierServiceImpl;
import com.service.impl.SysRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.impl.SysUserServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    SysUserServiceImpl service;//用户
    @Autowired
    SupplierServiceImpl service1;//供货商
    @Autowired
    StorageRecordServiceImpl service2;//入库信息
    @Autowired
    SysRoleServiceImpl sysRoleService;//入库信息
    QueryWrapper<SysUser> wrapper = new QueryWrapper<>();

    @RequestMapping("index")
    public  String hello(Model model){
        System.out.println("进来了登陆");
        return "login";
    }

    //角色管理页面列表
    @RequestMapping("UserAdmin")
    public  String UserAdmin(Model model){
        List<SysRole> sysRoleList=sysRoleService.list();
        model.addAttribute("sysRoleList",sysRoleList);
        return "sysRole/list";//进来了角色管理页面
    }

    @GetMapping("/storageRecord")
    public String storageRecord(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){
        Page<StorageRecord> userPage = new Page<>(pn,5);
        Page<StorageRecord> page = service2.page(userPage,null);
        long current = page.getCurrent();
        long pages = page.getPages();
        long total = page.getTotal();
        List<StorageRecord> records = page.getRecords();
        model.addAttribute("page",page);
        return "storageRecord/list";//进入了入库信息管理
    }

    @GetMapping("/ShopList")
    public String ShopList(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){
        Page<Supplier> userPage = new Page<>(pn,5);
        Page<Supplier> page = service1.page(userPage,null);
        long current = page.getCurrent();
        long pages = page.getPages();
        long total = page.getTotal();
        List<Supplier> records = page.getRecords();
        model.addAttribute("page",page);
        return "supplier/list";//去供货商页面
    }



    //退出登录
    @RequestMapping("OutLogin")
    public  String OutLogin(){
        return "login";//退出登录
    }

    @RequestMapping("updatePassword")
    public  String updatePassword(){
        return "sysUser/updatePassword";//进来了修改密码
    }

    @RequestMapping("RoleList")
    public  String RoleList(){
        return "sysRole/update";//进来了用户管理
    }

    @PostMapping(value = "login")
    public String login(String username, String password, HttpServletRequest request){
        System.out.println(username+"》》"+password);
        wrapper.eq("account",username);
        wrapper.eq("password",password);
        SysUser list=service.getOne(wrapper);
        if (list==null){
            System.out.println("查不到，登录失败");
            return "login";
        }
        request.getSession().setAttribute("userSession",list);
        System.out.println("查到了");
        return "frame";
    }




}
