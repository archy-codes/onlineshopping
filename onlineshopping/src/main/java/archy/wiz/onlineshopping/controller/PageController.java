package archy.wiz.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import archy.wiz.onlineshoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
  @RequestMapping(value= {"/","/home" , "/index"})
  public ModelAndView index() {
	  ModelAndView model = new ModelAndView("page");
	  model.addObject("message","welcome to spring web mvc");
	  model.addObject("categories",categoryDAO.listActiveCategories());
	  return model;
  }
}
