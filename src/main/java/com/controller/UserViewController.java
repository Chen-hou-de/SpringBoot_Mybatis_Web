package com.controller;

import com.pojo.SysRole;
import com.service.impl.StorageRecordServiceImpl;
import com.service.impl.SupplierServiceImpl;
import com.service.impl.SysRoleServiceImpl;
import com.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class UserViewController {

    @Autowired
    SysRoleServiceImpl sysRoleService;//入库信息

    @RequestMapping("/UserAdd")
    public  String UserAdd(Model model){
        List<SysRole> courses = sysRoleService.list();
        model.addAttribute("courses",courses);
        return "sysUser/add";//去添加用户页面
    }

    @RequestMapping("/sysRoleAdd")
    public  String sysRoleAdd(){
        return "sysRole/add";//去添加用户页面
    }

    @RequestMapping("/RoleUpdate")
    public  String RoleUpdate(Integer id,Model model){
        System.out.println("修改的id是"+id);
        SysRole sysRole =sysRoleService.getById(id);
        model.addAttribute("sysRole",sysRole);
        return "sysRole/update";//去修改用户页面
    }

    @ResponseBody
    @RequestMapping("/RoleDelete")
    public  Boolean RoleDelete(Integer id){
        System.out.println("需要删除的id是"+id);
        return sysRoleService.removeById(id);//删除成功后的地址
    }

    //修改成功
    @RequestMapping("/roleForm")
    public  String roleForm(Integer id,String roleName ){
        Integer number =sysRoleService.roleForm(id,roleName);
        return "redirect:UserAdmin";
    }

    @RequestMapping("/RoleAdd")
    public  String RoleAdd(String code,String roleName ){
        System.out.println("进来了新增"+code);
        System.out.println("进来了"+roleName);
        SysRole sysRole = new SysRole(null,code,roleName,1L,new Date(),null,null);
        Boolean b =sysRoleService.save(sysRole);
        System.out.println(b);
        return "redirect:UserAdmin";
    }



}
