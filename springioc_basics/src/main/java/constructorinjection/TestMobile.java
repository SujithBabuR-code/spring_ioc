package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ioc.xml");
	 Mobile mobile= (Mobile) applicationContext.getBean("mob");
	 System.out.println(mobile);
}
}
