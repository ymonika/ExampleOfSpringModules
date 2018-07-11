package examples.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"examples.example"})
public class SpringBootMain {

    public static void main(String[] args) {
        SpringApplication.run( SpringBootMain.class, args);
    }
}
