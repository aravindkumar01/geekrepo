package com.heroku.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	 private RecordRepository repository;

	    @Autowired
	    public SearchController(RecordRepository repository) {
	        this.repository = repository;
	    }


	
	 @RequestMapping(value="/main",method = RequestMethod.GET)
	    public String home() {
	        
	    	
	    	return "index";
	    }
	    @RequestMapping(value="/regs",method = RequestMethod.GET)
	    public String regs(ModelMap model) {
	    	
	    	return "event";
	   }
	   /* @RequestMapping(value="/regs/insert",method = RequestMethod.POST)
	    public RedirectView insertData(ModelMap model, 
                @ModelAttribute("Record") @Valid Record record,
                BindingResult result) {
               if (!result.hasErrors()) {
               repository.save(record);
                    }
               RedirectView redirectView = new RedirectView();
	    	    redirectView.setContextRelative(true);
	    	    redirectView.setUrl("/main");
	    	    return redirectView;

}*/
	    @RequestMapping(value="/index",method = RequestMethod.GET)
	    public RedirectView index() {	    	 
	    	    RedirectView redirectView = new RedirectView();
	    	    redirectView.setContextRelative(true);
	    	    redirectView.setUrl("/main");
	    	    return redirectView;

	    }
	    
	    @RequestMapping(value="/adminCheck",method = RequestMethod.POST)
	    public String adminChck(@ModelAttribute("Admin")Admin admin) {
	    	
	    	String res="warning";
	    	if(admin.getUsername().equals("kgisliim")&&admin.getPassword().equals("iimkgisl"))
	    	{
	    		res="details";
	    	}
	    	
	    	return res;
	    	
	  
	   }
	    @RequestMapping(value="/admin",method = RequestMethod.GET)
	    public String admin() {
	    	
	    	
	        return "admin";
	   }


	    @RequestMapping(value="ListStudent1",method = RequestMethod.GET, produces = "application/json")
	    public @ResponseBody List<Record> lsit() {
	    	//System.out.println("hai");
	    	List<Record> records = repository.findAll();
	    	//System.out.println(records.size());
	    	
	        return records;
	   }
	  
	    
}
