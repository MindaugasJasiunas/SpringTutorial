import com.company.roughPrototype.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach=context.getBean("myTrackCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());

    }
}
