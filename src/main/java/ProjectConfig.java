import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    cat cat(){
        var c = new cat();
        c.setName("ruby");
        return c;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }

}
