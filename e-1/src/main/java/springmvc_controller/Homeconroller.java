package springmvc_controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springmvc_controller.dao.RegisterDao;
import springmvc_controller.entity.user;

@Controller

public class Homeconroller {
	@Autowired
	RegisterDao dao;
	@RequestMapping("/")
	public String home(Model m) {
			List<user> list=dao.getall();
			m.addAttribute("list", list);
		return "dashboard";
	}
	@RequestMapping ("/home")
	public String home() {
		System.out.println("Hey");
		return "home" ;}

	@RequestMapping (value="/save",method=RequestMethod.POST)
	public String savedetails(@ModelAttribute("registerpost") user User,Model m) {
		
		this.dao.save(User);

		m.addAttribute("price", User.getPrice());
		return "bill" ;}
	@RequestMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id")int productid,HttpServletRequest request) {
			
		this.dao.delete(productid);
			RedirectView rd=new RedirectView();
			rd.setUrl(request.getContextPath()+"/");
			return rd;
		}
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") int pid,Model m) {
		user p=this.dao.getProduct(pid);
		m.addAttribute("p", p);
		return "update-form";
	}
	
	

}
