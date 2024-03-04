package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demoWebAppController {
	
	/*
 	Important : Here we are using jsp file as view but
 	1st we have to tell spring application so that it 
 	converts jsp files to servlet.
	*/

	/*
	 * ResponseBody annotation is used to get the data we return inside a class, but
	 * it replaces the web page.
	 */
//	@ResponseBody 

//	@RequestMapping("/demo_web_app")
//	/*Here 'RequestParam' annotation is used to fix the parameter we use in url */
//	public String display(@RequestParam("name")String cname, HttpSession session /*HttpServletRequest req*/) {
//		
//		System.out.println("Welcome to the Controller");
//
//		// session obj is created and initialized using the 'req' object
//		// HttpSession session = req.getSession();*
//		
//		// 1st we get the value from url in a string variable
//		// String name = req.getParameter("name");
//		// And printing it on console (optional)
//		System.out.println(cname);
//		
//		/*
//		 session obj is used to assign the
//		 value we get from url to a string
//		 so that we can use it in our view as well
//		 */
//		session.setAttribute("Name", cname);
//		// Here we are returning the view or .jsp file
//		return "demoWebApp";	
//	}

//	 If u don't want to use the HttpSession then we use ModalAndView class
//	 ModalAndView class it provides a dispatcherServlet w/c requires data and view.

	@RequestMapping("/demo_web_app")
	public ModelAndView display(@RequestParam("name") String cname) { 		
		
		System.out.println("Welcome to the Controller");
		System.out.println(cname);
// Creating Object of ModelAndView class
		ModelAndView mv = new ModelAndView();
// here we are adding attributeName & attribuiteValue to the model
// this attributeName is used in the view to get the data		
		mv.addObject("Name", cname);
// Setting the view name for the ModelAndView
		mv.setViewName("demoWebApp");
		return mv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
