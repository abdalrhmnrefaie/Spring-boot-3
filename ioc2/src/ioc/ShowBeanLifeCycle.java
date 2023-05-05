package ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ShowBeanLifeCycle  implements InitializingBean , DisposableBean,BeanPostProcessor{

	public void afterPropertiesSet() throws Exception {
		System.out.println("hi bean is Initializing");
		
	}

	public void destroy() throws Exception {
		System.out.println("hi bean is Disposable ");
	}

	public Object postProcessAfterInitialization(Object been, String beenName) throws BeansException {
		System.out.println("In post Process After " + beenName);
		return been;
	}

	public Object postProcessBeforeInitialization(Object been, String beenName) throws BeansException {
		System.out.println("In post Process Before " + beenName);
		return been;
	}

}
