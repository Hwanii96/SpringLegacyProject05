import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        BeanFactory beanFactory = new BeanFactory();

        Phone phone = (Phone) beanFactory.getBean("갤럭시폰");

        phone.volumeUp();
        phone.volumeDown();

        //  컴파일을 하면 NullPointerException 발생.
        //  GalaxyWatch가 객체화가 되어 있지 않기 때문 이다.

    }   //  main()

}   //  Client
