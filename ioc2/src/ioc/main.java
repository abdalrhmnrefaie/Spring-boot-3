package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		
//		 Employee em = new Employee();
		 
		 
//		 BeanFactory factory= new XmlBeanFactory(new ClassPathResource("bean.xml"));
		 
//		 AbstractApplicationContext context= new FileSystemXmlApplicationContext
//				 ("C:\\Users\\abdal\\Documents\\workspace-spring-tool-suite-4-4.18.0.RELEASE\\ioc\\src\\bean.xml");
//		 
//		 context.registerShutdownHook();
		 
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		
		ApplicationContext clx = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		
		
		 Employee em =(Employee) context.getBean("emp");
		      em.setName("mohamed");
		      em.setSalary(200000.0);
		
			 em.printName();
		  
		
	}

}
