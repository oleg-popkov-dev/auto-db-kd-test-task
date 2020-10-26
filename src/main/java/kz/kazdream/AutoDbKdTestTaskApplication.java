package kz.kazdream;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutoDbKdTestTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoDbKdTestTaskApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner rabbitTest(ApplicationContext applicationContext) {
//        return args -> {
//            RabbitTemplate rabbitTemplate = new RabbitTemplate();
//            AutoDTO autoDTO = new AutoDTO();
//            autoDTO.setColor("white");
//            autoDTO.setEngineVolume(3.0);
//            autoDTO.setGasTank(70);
//            autoDTO.setMark("toyota");
//            rabbitTemplate.convertAndSend(RabbitListener.AUTO_TOPIC, RabbitListener.AUTO_ROUTE, "{\"mark\":\"TOYOTA\", \"model\":\"Supra\",\"vin\":\"A80\"}");
//        };
//    }

}
