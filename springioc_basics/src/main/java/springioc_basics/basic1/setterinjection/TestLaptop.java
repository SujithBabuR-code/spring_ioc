package springioc_basics.basic1.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLaptop {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setBrand("dell");
		laptop.setColor("black");
		laptop.setCost(30000);
//	System.out.println(laptop);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
		Laptop laptop2 = (Laptop) applicationContext.getBean("lap");
		System.out.println(laptop2);

	}
}
