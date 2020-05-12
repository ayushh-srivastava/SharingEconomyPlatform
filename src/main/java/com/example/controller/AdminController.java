
package com.example.controller;




import java.util.List;

import javax.validation.Valid;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.entity.Admin;
import com.example.model.Category;
import com.example.model.ServiceCategory;
import com.example.service.AdminService;
import com.example.service.VendorService;


@Controller
@SessionAttributes("admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	
	public void setAdminService(AdminService adminService)
	{
		this.adminService=adminService;
	}
	@ModelAttribute("admin")
	public Admin getAdmin()
	{
		return new Admin();
	}
	@RequestMapping("/adminlogin")
	public String adminLogin(Model model)
	{
		model.addAttribute("admin", new Admin());
		return "adminlogin";
	}
	@RequestMapping(value="/adminvalidate",method=RequestMethod.POST)
	public String validateLogin(@Valid @ModelAttribute("admin")Admin admin,ModelMap model,
			RedirectAttributes redirectAttributes,@SessionAttribute("admin") Admin adm)
	{
		String result="";
		Admin a = adminService.validateAdmin(admin);
		if(a!=null)
		{
		model.addAttribute("msg",admin.getAdminId());
		result="adminhome";
		}
		else
		{
		String adminId=adminService.checkAdminId(admin.getAdminId());
		System.out.println(adminId);
		if(adminId!=null)
		{
		String password=adminService.checkPassword(admin.getPassword());
		if(password==null)
		redirectAttributes.addFlashAttribute("msg", "Password Not Matching");
		result="redirect:adminlogin";
		}
		else
		{
		redirectAttributes.addFlashAttribute("msg", "AdminId Not Present");
		result="redirect:adminlogin";
		}
		}
		return result;
		}
	@RequestMapping("/adminlogoff")
	public String adminLogoff(Model model)
	{
		model.addAttribute("admin", new Admin());
		return "index";
	}
@RequestMapping(value="/addCategorya")
	public String addCategory(@ModelAttribute("category")Category category)
	{
		adminService.addCategory(category);
				
				return "addcategorya";
	
	}
	@RequestMapping("/getCategorya")
	public  String getCategory(ModelMap model)// @SessionAttribute("vendorRegister")VendorRegister ven)
	{
		List<Category> p1List=adminService.fetchCategory();//.fetchProduct(ven.getVendorId());
		System.out.println(p1List.size());
		 if(p1List==null)
				throw new NoDataFoundException();
		model.addAttribute("p1list",p1List);
		return "adminhome";
	}
	@RequestMapping(value="/addServiceCategorya")
	public String addServiceCategory(@ModelAttribute("servicecategory")ServiceCategory servicecategory)
	{
		adminService.addServiceCategory(servicecategory);
				
				return "addservicecategorya";
	
	}
	@RequestMapping("/getServiceCategorya")
	public  String getServiceCategory(ModelMap model)// @SessionAttribute("vendorRegister")VendorRegister ven)
	{
		List<ServiceCategory> s1List=adminService.fetchServiceCategory();//.fetchProduct(ven.getVendorId());
		System.out.println(s1List.size());
		 if(s1List==null)
				throw new NoDataFoundException();
		model.addAttribute("s1list",s1List);
		return "adminhome";
	}
	
	
	
	

}
