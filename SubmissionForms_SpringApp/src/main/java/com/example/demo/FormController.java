package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class FormController {
	/*
	 * 'Requested Mapping' is used to request for a specific url 'Get Mapping':-
	 * Here we have to use the exact text we are mentioned
	 */

	/*
	 * Here is the code that returns the view.jsp to take the details and
	 * ViewCustomerDetails.jsp is returned to see the entered details
	 */
//	@GetMapping("/subform")
//	public String displaySubForm() {
//		// returning the view.jsp
//		return "view";
//	}
//
//	@PostMapping("/details")
//	public String viewdetails(@RequestParam("cid") int cid, @RequestParam("cname") String cname,
//			@RequestParam("cemail") String cemail, ModelMap modelMap) {
//		modelMap.put("cid", cid);
//		modelMap.put("cname", cname);
//		modelMap.put("cemail", cemail);
//		// returning the ViewCustomerDetails.jsp
//		return "ViewCustomerDetails";
//	}
	/*-------------------------------------------------------*/
	// Code when we use h2 database to perform crud operations
//	@Autowired
//	CustomersRepo repo;
//
//	// 1st we request this method
//	@RequestMapping("/subform")
//	public String displaySubForm() {
//		// returning the view.jsp
//		return "view";
//	}
//
//	// after filling & submitting the details we redirected to same view.jsp
//	@RequestMapping("/details")
//	public String setdetails(Customers customers) {
//		
//		// saving the received data
//		repo.save(customers);
//		
//		// returning the view.jsp
//		return "view";
//	}
//
//	/* 
//	 * After submitting the details we use this phrase 
//	 * to get the data from database  ViewCustomersDetails.jsp
//	*/
//	@RequestMapping("/getdetails")
//	public String getdetails() {
//		return "ViewCustomerDetails";
//	}
//
//	// to show the entered details on view
//	@PostMapping("/getdetails")
//	public ModelAndView getdetails(@RequestParam int cid) {
//
//		ModelAndView mv = new ModelAndView("Retrive");
//		Customers customers = repo.findById(cid).orElse(null);
//		mv.addObject(customers);
//		return mv;
//	}

	/*-------------------------------------------------------*/
//	code for how to perform CRUD operation in a simple web application

	@Autowired
	CustomersRepo repo;

	// we use this method to add data into the database
	@RequestMapping("/subform")
	public String displaySubForm() {
		// returning the view.jsp
		return "view";
	}

	// after filling & submitting the details we redirected to same view.jsp
	@RequestMapping("/details")
	public String setdetails(Customers customers) {

		// saving the received data
		repo.save(customers);

		// returning the view.jsp
		return "view";
	}
	
	/*
	 * This method is used to view all the customers inside the database
	 */
	@RequestMapping("/customers")
	@ResponseBody
	public List<Customers> getCustomers() {
		return repo.findAll();
	}
	
	/*
	 * This method is used to view the specific 
	 * customers inside the database
	 */
	@RequestMapping("/getCustomer/{cid}")
	@ResponseBody
	public Optional<Customers> getCustomers2(@PathVariable("cid" ) int cid) {
		return repo.findById(cid);
	}
	
	/*
	 * we use this method to delete a data in database 
	 */
	@DeleteMapping("/customers/{cid}")
	public Customers getCustomers3(@PathVariable("cid") int cid) {	
		Customers cust = repo.getById(cid);
		repo.delete(cust);
		return cust;
	}
	
	/*
	 * we use this method to Put/update any data in database 
	 */
	@PutMapping(path="/customers", consumes= {"application/json"} )
	public Customers getCustomers4(@RequestBody Customers customers) {	
		repo.save(customers);
		return customers;
	}
	
	
	
	
	
	
}
