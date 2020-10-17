import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CyberApp {

    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
       // Mentor mentor = new FullTimeMentor();
        //Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
        //or
        Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);
        mentor.createAccount();

        mentor = (Mentor)container.getBean("partTimeMentor");
        mentor.createAccount();

    }
}

