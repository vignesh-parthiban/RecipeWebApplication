package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.RecipeEntity;
import com.example.demo.service.RecipeService;

@Controller
public class RecipeController {
	
	 @Autowired
	    private RecipeService service;
 
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        List<RecipeEntity> listrecipe = service.listAll();
	        model.addAttribute("listrecipe", listrecipe);
	        System.out.print("Get / ");	
	        return "index";
	    }
 
	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("recipetable", new RecipeEntity());
	        return "new";
	    }
 
	    // To save a recipe
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saverecipe(@ModelAttribute("recipetable") RecipeEntity std) {
	        service.save(std);
	        return "redirect:/";
	    }
 
	    // Editing a recipe
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditrecipepage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("new");
	        RecipeEntity std = service.get(id);
	        mav.addObject("recipetable", std);
	        return mav;	        
	    }
	    
	    // Deleting a recipe
	    @RequestMapping("/delete/{id}")
	    public String deleterecipe(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/";
	    }
}
