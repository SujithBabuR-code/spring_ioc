package springioc_basics.basic1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Phone1 {
	public static void main(String[] args) {
//		MusicPlayer musicPlayer = new MusicPlayer();
//		musicPlayer.startMusic();

		ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
		MusicPlayer musicPlayer = (MusicPlayer) context.getBean("mp");
		MusicPlayer musicPlayer1 = (MusicPlayer) context.getBean("mp"); //used to check multiple time obj creation
		musicPlayer.startMusic();
		
		ClassPathResource resource=new ClassPathResource("ioc.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		   MusicPlayer musicPlayer2=(MusicPlayer) beanFactory.getBean("mp");
		   musicPlayer2.startMusic();
	}
}
