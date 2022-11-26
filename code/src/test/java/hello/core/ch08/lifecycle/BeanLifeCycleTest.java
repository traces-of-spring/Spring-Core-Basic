package hello.core.ch08.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {

    @Test
    public void lifeCycleTest() {
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
//        NetworkClient client = ac.getBean(NetworkClient.class);
        NetworkClientWithInitMethod client = ac.getBean(NetworkClientWithInitMethod.class);
        ac.close();
    }

    @Configuration
    static class LifeCycleConfig {

//        @Bean
        public NetworkClient networkClient() {
            NetworkClient networkClient = new NetworkClient();
            networkClient.setUrl("http://hello-spring.dev");

            return networkClient;
        }
        @Bean(initMethod = "init", destroyMethod = "close")
        public NetworkClientWithInitMethod networkClientWithInitMethod() {
            NetworkClientWithInitMethod networkClient = new NetworkClientWithInitMethod();
            networkClient.setUrl("http://hello-spring.dev");

            return networkClient;
        }
    }
}
