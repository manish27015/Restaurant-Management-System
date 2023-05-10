package springmvc_controller.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc_controller.entity.user;

@Repository
public class RegisterDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public void save(user details) {
		this.hibernateTemplate.saveOrUpdate(details);
	
	}
	public List<user> getall() {
		List<user> list=this.hibernateTemplate.loadAll(user.class);
		System.out.println("loadd");
		return list;

	}
	@Transactional
	public void delete(int pid) {
		user p=this.hibernateTemplate.load(user.class, pid);
		this.hibernateTemplate.delete(p);
	}
	public user getProduct(int pid) {
		 return this.hibernateTemplate.get(user.class,pid);
	 }
}
