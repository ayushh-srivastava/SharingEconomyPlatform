package com.example.controller;




import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.Category;
import com.example.model.Product;
import com.example.model.ServiceCategory;
import com.example.model.Services;
import com.example.model.Vendor;
import com.example.model.VendorRegister;
import com.example.service.VendorService;


@Controller
@SessionAttributes({"vendor","vendorRegister"})

public class VendorController {
	@Autowired
	VendorService vendorService;
	public void setVendorService(VendorService vendorService)
	{
		this.vendorService=vendorService;
	
	}
	@ModelAttribute("vendor")
	public Vendor getVendor () {
		return new Vendor();
	}
	@ModelAttribute("vendorRegister")
	public VendorRegister getVendorRegister () {
		return new VendorRegister();
	}
	@RequestMapping(value="/vendorlogin")
	public String vendorLogin(Model model)
	{
		model.addAttribute("vendorRegister", new VendorRegister());
		return "vendorlogin";
	}
	
	@RequestMapping(value="/vendorvalidate",method=RequestMethod.POST)
	public String vendorRegistration(@Valid @ModelAttribute("vendorRegister")VendorRegister vendorRegister,
			BindingResult bresult,ModelMap model,
			RedirectAttributes redirectAttributes)
	{
		String result="";
		
		if(bresult.hasErrors())
		{
			System.out.println("validation errors");
			result="vendorlogin";
		}
		else
		{
			model.addAttribute("msg", vendorRegister.getVendorId());
			System.out.println("no validation errors");
			System.out.println(vendorRegister.getVendorId()+" "+vendorRegister.getPassword());
			Vendor v=vendorService.validateVendor(vendorRegister);
			if(v!=null)
			{
				model.addAttribute("vendor", v);
				result="vendorhome";
			}
			else
			{
				redirectAttributes.addFlashAttribute("msg", "Invalid Id/Password");
				result= "redirect:vendorlogin";
			}
		}
		return result;
	}
	@RequestMapping("/vendorlogoff")
	public String vendorLogoff(Model model)
	{
		model.addAttribute("vendor", new Vendor());
		return "index";
	}

	@RequestMapping(value="/vendorregistration")
	public String showVendorRegistration(Model model)
	{
		model.addAttribute("vendor", new Vendor());
		return "vendorregistration";
	}
	@RequestMapping(value = "/vendorregister", method = RequestMethod.POST)
	public String validateLogin(@Valid @ModelAttribute("vendor") Vendor vendor,BindingResult bresult, ModelMap model,
			RedirectAttributes redirectAttributes) {
			String result = "";
		if(bresult.hasErrors())
		{
			System.out.println("validation errors");
			
			result="vendorregistration";
		}
		
		else
		{
		System.out.println("method called");
		
		vendorService.addVendor(vendor);
		result="successregistration";
		}
		
		return result;
	}
	@RequestMapping(value="/vendordetails/{vendorId}")
	public String vendorDetails(@PathVariable("vendorId") int vendorId,ModelMap model)
	{
		System.out.println(vendorId);
		Vendor vendor=vendorService.getVendor(vendorId);
		model.addAttribute("command", vendor);
		return "editVendor";
	}
	@PostMapping(value="/update")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor,Model model) throws RuntimeException
	{
		vendorService.updateVendor(vendor);
		return "vendorhome";
	}
	@GetMapping(value="/showProductPage")
	public String showProductPage(Model model, @SessionAttribute("vendorRegister")VendorRegister ven)
	{
		
				model.addAttribute("product", new Product());
				model.addAttribute("vendorId", ven.getVendorId());
				List<Category> p1List=vendorService.fetchCategory();//.fetchProduct(ven.getVendorId());
				System.out.println(p1List.size());
				 if(p1List==null)
						throw new NoDataFoundException();
				model.addAttribute("p1list",p1List);
				return "add_product_details";
	}
	@PostMapping(value="/addProduct")
	public String addProduct(@ModelAttribute("product")Product product)
	{
		System.out.println("id="+product.getCategoryId());
		vendorService.addProduct(product);
				
				return "vendorhome";

	}
	//----------get products----------
	
		@RequestMapping("/getProduct")
		public  String getProduct(ModelMap model, @SessionAttribute("vendorRegister")VendorRegister ven)
		{
			List<Product> pList=vendorService.fetchProduct(ven.getVendorId());//.fetchProduct(ven.getVendorId());
			 if(pList==null)
					throw new NoDataFoundException();
			model.addAttribute("plist",pList);
			return "productadded";
		
		
		}
		
		//-----------edit product-----------
		
			@RequestMapping(value="/editproduct/{productId}")
		public String editProduct(@PathVariable("productId") Integer productId,ModelMap model)
		{
				System.out.println(productId);
				Product product=vendorService.getProduct(productId);
				//model.addAttribute("patient", patient);
				//List<Category> p1List=vendorService.fetchCategory();
				List<Category> p1List=vendorService.fetchCategory();//.fetchProduct(ven.getVendorId());
				System.out.println(p1List.size());
				 if(p1List==null)
						throw new NoDataFoundException();
				model.addAttribute("p1list",p1List);
				model.addAttribute("command", product);
				return "editProduct";
		}
		@PostMapping(value="/updateProduct")
		public String updateProduct(@ModelAttribute("product") Product product,Model model) throws RuntimeException
		{
			vendorService.updateProduct(product);
			return "productadded";
		}
		@RequestMapping(value="/addCategory")
		public String addCategory(@ModelAttribute("category")Category category)
		{
			vendorService.addCategory(category);
					
					return "addcategory";
		
		}
		@RequestMapping("/getCategory")
		public  String getCategory(ModelMap model)// @SessionAttribute("vendorRegister")VendorRegister ven)
		{
			List<Category> p1List=vendorService.fetchCategory();//.fetchProduct(ven.getVendorId());
			System.out.println(p1List.size());
			 if(p1List==null)
					throw new NoDataFoundException();
			model.addAttribute("p1list",p1List);
			return "vendorhome";
		}
		@GetMapping(value="/showServicePage")
		public String showServicePage(Model model, @SessionAttribute("vendorRegister")VendorRegister ven)
		{
			//System.out.println("Id "+user.getUserid());
			model.addAttribute("service", new Services());
			model.addAttribute("vendorId", ven.getVendorId());
			List<ServiceCategory> s1List=vendorService.fetchServiceCategory();//.fetchProduct(ven.getVendorId());
			System.out.println(s1List.size());
			 if(s1List==null)
					throw new NoDataFoundException();
			model.addAttribute("s1list",s1List);
			return "add_service_details";
		}
		@PostMapping(value="/addService")
		public String addService(@ModelAttribute("service")Services service)
		{
			System.out.println("id="+service.getServicecategoryId());
			vendorService.addService(service);
					
					return "vendorhome";

		}
		//----------get products----------
		
			@RequestMapping("/getService")
			public  String getService(ModelMap model, @SessionAttribute("vendorRegister")VendorRegister ven)
			{
				List<Services> sList=vendorService.fetchService(ven.getVendorId());//.fetchProduct(ven.getVendorId());
				 if(sList==null)
						throw new NoDataFoundException();
				model.addAttribute("slist",sList);
				return "serviceadded";
			
			}
			
			//-----------edit product-----------
			
				@RequestMapping(value="/editservice/{serviceId}")
			public String editService(@PathVariable("serviceId") Integer serviceId,ModelMap model)
			{
					System.out.println(serviceId);
					Services service=vendorService.getService(serviceId);
					//model.addAttribute("patient", patient);
					//List<Category> p1List=vendorService.fetchCategory();
					List<ServiceCategory> s1List=vendorService.fetchServiceCategory();//.fetchProduct(ven.getVendorId());
					System.out.println(s1List.size());
					 if(s1List==null)
							throw new NoDataFoundException();
					model.addAttribute("s1list",s1List);
					model.addAttribute("command", service);
					return "editService";
			}
			@PostMapping(value="/updateService")
			public String updateService(@ModelAttribute("service") Services service,Model model) throws RuntimeException
			{
				vendorService.updateService(service);
				return "serviceadded";
			}
			@RequestMapping(value="/addServiceCategory")
			public String addServiceCategory(@ModelAttribute("servicecategory")ServiceCategory servicecategory)
			{
				vendorService.addServiceCategory(servicecategory);
						
						return "addservicecategory";
			
			}
			@RequestMapping("/getServiceCategory")
			public  String getServiceCategory(ModelMap model)// @SessionAttribute("vendorRegister")VendorRegister ven)
			{
				List<ServiceCategory> s1List=vendorService.fetchServiceCategory();//.fetchProduct(ven.getVendorId());
				System.out.println(s1List.size());
				 if(s1List==null)
						throw new NoDataFoundException();
				model.addAttribute("s1list",s1List);
				return "vendorhome";
			}
			
		
		

}