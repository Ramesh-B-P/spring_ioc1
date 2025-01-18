package spring_ioc.ac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mobile1 {
 
	public static void main(String[] args) {
	 	MusicPlayer musicPlayer=new MusicPlayer();
	 	musicPlayer.startMusic();
	 
//	 
//	 //	 loading xml into file into container
//	 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("iocac.xml");
//	 //	calling  get Bean()  to get instance /object/Bean 
//	 MusicPlayer musicPlayer=(MusicPlayer) applicationContext.getBean("mp");
//	 musicPlayer.startMusic();
		
		
//		
//		//beanfactory
//		//finding xml file
//		ClassPathResource classPathResource= new ClassPathResource("iocac.xml");
//		//loading xml file
//		 BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		 // calling getBean()
//		 MusicPlayer musicPlayer= (MusicPlayer) beanFactory.getBean("mp");
//		WhatsApp whatsApp= (WhatsApp) beanFactory.getBean("wa");
//		 //musicPlayer.startMusic();
	}
}
