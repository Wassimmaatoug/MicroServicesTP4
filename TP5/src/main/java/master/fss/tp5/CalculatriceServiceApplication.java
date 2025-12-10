package master.fss.tp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalculatriceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculatriceServiceApplication.class, args);
    }
}