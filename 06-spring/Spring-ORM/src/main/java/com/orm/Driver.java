package com.orm;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.LightSaberDao;
import com.orm.model.LightSabers;

public class Driver {
	
	private static ApplicationContext ac = new ClassPathXmlApplicationContext("whatever-we-want.xml");

	public static void main(String[] args) {
//		LightSabers ls = LightSabers.newInstance(1, "boleh", null, 4.6);
//		ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
//		Validator v = vf.getValidator();
//		Set<ConstraintViolation<LightSabers>> violations = v.validate(ls);
//		System.out.println(violations.size());
//		violations.stream().forEach(e->System.out.println(e.getMessage()));
		
		insertInitialValues();
		System.out.println(ac.getBean(LightSaberDao.class).findAll());
	}
	
	private static void insertInitialValues() {
		LightSaberDao dao = ac.getBean(LightSaberDao.class);
		dao.insert(LightSabers.newInstance(0, "red", "maul", 4.8));
		dao.insert(LightSabers.newInstance(0, "green", "Luke", 3.5));
		dao.insert(LightSabers.newInstance(0, "purple", "mace windu", 4.5));
	}
}
