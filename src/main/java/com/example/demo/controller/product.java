package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.DTO.productDTO;
import com.example.demo.Repository.productrepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class product {
	
	@Autowired
	private productrepository productrepository;
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<productDTO> list=productrepository.findAll();
		m.addAttribute("all_products",list);
		
		return "new";
	}
	
	@GetMapping("/File_form")
	public String Fileform()
	{
		return "File";
	}
	
	@GetMapping("/Edit_form/{id}")
	public String Editform(@PathVariable(value="id") int id,Model m)
	{
		Optional<productDTO> productDto=productrepository.findById(id);
		productDTO product=productDto.get();
		m.addAttribute("productDTO", product);
		return "Edit";
	}
	
	@PostMapping(("/save_products"))
	public String saveProducts(@ModelAttribute productDTO product,HttpSession session)
	{
		productrepository.save(product);
		session.setAttribute("msg", "Product added successfully..");
		return "redirect:/File_form";
	}
	
	@PostMapping(("/update_products"))
	public String updateProducts(@ModelAttribute productDTO product,HttpSession session)
	{
		productrepository.save(product);
		session.setAttribute("msg", "Product updated successfully..");
		return "redirect:/";
	}
	
	@GetMapping("/Delete/{id}")
	public String deleteProducts(@PathVariable(value="id") int id,HttpSession session)
	{
		productrepository.deleteById(id);
		session.setAttribute("msg", "Product deleted successfully..");
	
		return"redirect:/";
	}

}
