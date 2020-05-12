package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.Customer;
import com.example.model.CustomerCart;
import com.example.model.CustomerRegister;
import com.example.model.CustomerServiceCart;
import com.example.model.Product;
import com.example.model.ProductCategory;
import com.example.model.ServiceProductCategory;
import com.example.model.Services;
import com.example.service.CustomerService;

@Controller
@SessionAttributes({"customer","customerRegister"})
public class CustomerController {
	@Autowired
	CustomerService customerService;
	public void setCustomerService(CustomerService customerService)
	{
		this.customerService=customerService;
	
	}
	@ModelAttribute("customer")
	public Customer getCustomer () {
		return new Customer();
	}
	@ModelAttribute("customerRegister")
	public CustomerRegister getCustomerRegister () {
		return new CustomerRegister();
	}
	@RequestMapping(value="/customerlogin")
	public String customerLogin(Model model)
	{
		model.addAttribute("customerRegister", new CustomerRegister());
		return "customerlogin";
	}
	
	@RequestMapping(value="/customervalidate",method=RequestMethod.POST)
	public String customerRegistration(@Valid @ModelAttribute("customerRegister")CustomerRegister customerRegister,
			BindingResult bresult,ModelMap model,
			RedirectAttributes redirectAttributes)
	{
		String result="";
	
		if(bresult.hasErrors())
		{
			System.out.println("validation errors");
			result= "customerlogin";
		}
		else
		{
			model.addAttribute("msg", customerRegister.getCustomerId());
			System.out.println("no validation errors");
			System.out.println(customerRegister.getCustomerId()+" "+customerRegister.getPassword());
			CustomerRegister c=customerService.validateCustomer( customerRegister);
			if(c!=null)
			{
				result="customerhome";
			}
			else
			{
				redirectAttributes.addFlashAttribute("msg", "Invalid Id/Password");
				result= "redirect:customerlogin";
			}
		}
		return result;
	}
//	@PostMapping(value="/customerregister")
//	public String registerCustomer(@Valid @ModelAttribute("customer")Customer customer)
//	{
//		customerService.addCustomer(customer);
//		return "successregistration";
//	}
	@RequestMapping(value="/customerregistration")
	public String showCustomerRegistration(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "customerregistration";
	}
	@RequestMapping(value = "/customerregister", method = RequestMethod.POST)
	public String validateLogin(@Valid @ModelAttribute("customer") Customer customer,BindingResult bresult, ModelMap model,
			RedirectAttributes redirectAttributes) {
			String result = "";
		if(bresult.hasErrors())
		{
			System.out.println("validation errors");
			
			result="customerregistration";
		}
		
		else
		{
		System.out.println("method called");
		
		customerService.addCustomer(customer);
		result="successregistration";
		}
		
		return result;
	}
	@RequestMapping("/customerlogoff")
	public String customerLogoff(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "index";
	}
	
	@RequestMapping("/viewProduct")
	public  String getProduct(@ModelAttribute("pro") ProductCategory pro, ModelMap model)// ,@SessionAttribute("customerRegister")CustomerRegister ven)
	{
		List<Product> p2List=customerService.fetchProductss();//.fetchProduct(ven.getVendorId());
		 if(p2List==null)
				throw new NoDataFoundException();
		model.addAttribute("p2list",p2List);
		return "customerhome";
	
	}
@RequestMapping("/searchPage")
		public String searchPage(Model model)
		{
	model.addAttribute("pro", new ProductCategory());
	return "searchPage";
		}
	
	@RequestMapping("/fetchProducts")
	public String fetchProducts(@ModelAttribute("pro") ProductCategory pro, Model model)
	{
		List<ProductCategory> plist=customerService.productCategoryDetails(pro.getCategoryName());
		System.out.println(plist.size());
		for(ProductCategory obj:plist)
		{
			System.out.println(obj.getProductId()+" "+obj.getProductName() +" "+obj.getCategoryName());
		}
		model.addAttribute("productList",plist);
		return "customerhome";
	}
	@RequestMapping("/viewService")
	public  String getService(@ModelAttribute("sro") ServiceProductCategory sro, ModelMap model)// ,@SessionAttribute("customerRegister")CustomerRegister ven)
	{
		List<Services> s2List=customerService.fetchServiceProductss();//.fetchProduct(ven.getVendorId());
		 if(s2List==null)
				throw new NoDataFoundException();
		model.addAttribute("s2list",s2List);
		return "customerhome";
	
	}
@RequestMapping("/searchServicePage")
		public String searchServicePage(Model model)
		{
	model.addAttribute("sro", new ServiceProductCategory());
	return "searchServicePage";
		}
	
	@RequestMapping("/fetchServicess")
	public String fetchServicesProducts(@ModelAttribute("sro") ServiceProductCategory sro, Model model)
	{
		List<ServiceProductCategory> slist=customerService.serviceCategoryDetails(sro.getServicecategoryName());
		System.out.println(slist.size());
		for(ServiceProductCategory obj:slist)
		{
			System.out.println(obj.getServiceId()+" "+obj.getServiceName() +" "+obj.getServicecategoryName());
		}
		model.addAttribute("serviceList",slist);
		//display this list in the jsp page.values are fetched from both product and
		//category table
		return "customerhome";
	}
	@RequestMapping(value="/addToCart")
	public String addToCart(@RequestParam("productId") int productId,@SessionAttribute("customerRegister") CustomerRegister cust)
	{
		
		customerService.addCart(productId,cust.getCustomerId());//second argument is customerid,get from session
		//System.out.println(");		
		return "addcartpage";
	
	
	}
	
	//@Override
	
	@RequestMapping(value = "/showCart")
	public String showCart(Model model, @SessionAttribute("customerRegister") CustomerRegister cust) {
	List<CustomerCart> cartList = customerService.showCart(cust.getCustomerId());
	System.out.println("cart list"+cartList.size());
	model.addAttribute("cartList", cartList);
	Float amount = customerService.generateBill(cust.getCustomerId());
	model.addAttribute("amount", amount);
	return "cartList";

	}




	@RequestMapping(value="/bookservice")
	public String addToCart(@ModelAttribute("CustomerServiceCart")CustomerServiceCart CustomerServiceCart,
			@RequestParam("serviceId") int serviceId,@SessionAttribute("customerRegister") CustomerRegister cust)
	{
		
		customerService.addServiceCart(serviceId,cust.getCustomerId());//second argument is customerid,get from session
				return "addservicecartpage";
	
	
	}
	@RequestMapping(value="/serviceBill")
	public String generateServiceBill(Model model,
	@SessionAttribute("customerRegister") CustomerRegister cust)
	{

	Float amount=customerService.generateServiceBill(cust.getCustomerId());

	model.addAttribute("amount", amount);
	return "addservicecartpage";
	}
	
}