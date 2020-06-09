package com.cognizant;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  

@Controller
public class ElectricityBillController {
	
	@RequestMapping("calculateBill")
	public String calculateBill(Model model)
	{
		Bill bill=new Bill();  
	      //provide reservation object to the model   
	    model.addAttribute("bill", bill);  
		return "billForm";
	}
	@RequestMapping("submitForm")
	public String submitForm(@ModelAttribute("bill") Bill bill)  
	{  
	    return "viewPage";  
	} 

}
