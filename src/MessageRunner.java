import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MessageRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/aplication-context-tst.xml");
		
		System.out.print("Esto es una modificacion");
		Message msg = (Message) ctx.getBean("message");
		

	}

}
