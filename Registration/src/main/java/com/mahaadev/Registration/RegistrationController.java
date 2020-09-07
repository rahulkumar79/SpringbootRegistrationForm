package com.mahaadev.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mahaadev.Registration.dao.UserRepo;

@Controller
public class RegistrationController {

	@Autowired
	UserRepo repo;
     @RequestMapping("/regform")
     public String register() {
    	 return "registrationpage";
     }
     
   
     @RequestMapping("/userDetail")
     public String userInfo(UserRegistration reg) {
    	 repo.save(reg);
    	 return "operation";
     }
     
     @RequestMapping("/operation")
     public ModelAndView operation(Long UId, String ddlFlag) {
    	 if(ddlFlag.equals("select")) {
    		 UserRegistration reg = repo.findById(UId).orElse(new UserRegistration());	 
    	     return selectRecords(reg);
    	 }
    	 else if (ddlFlag.equals("delete")) {
    		 repo.deleteById(UId);
    	 }
    	 else if (ddlFlag.equals("update")){
    		 UserRegistration reg = repo.findById(UId).orElse(new UserRegistration());
    		 reg.setUName("Shaktimaan_is_here");
    		 repo.save(reg);
    	 } else {
    		 
    	 }
    	 return new ModelAndView("operation");
     }
    
     
     public ModelAndView selectRecords(UserRegistration reg) {
    		 
    		 
    		 ModelMap model = new ModelMap();
    	 		model.put("name", reg.getUName());
    	 		model.put("email", reg.getEmailId());
    	 		model.put("gender", reg.getGender() == Integer.parseInt("1") ? "Male" : "Female");
    	 		model.put("contact", reg.getContact());
    	 		model.put("address", reg.getAddress());
    	 		model.put("userCountry", reg.getUserCountry());
    	 		
    	 		ModelAndView mv = new ModelAndView("user-details");
    	 		mv.addObject("regObj", model);
    	 		return mv;
}
}