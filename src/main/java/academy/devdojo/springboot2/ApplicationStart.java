package academy.devdojo.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@EnableAutoConfiguration
////@ComponentScan(basePackages = "academy.devdojo.springboot2") // application is not in the expected directory, so this line has to be added to search the main(), restcontroller has @controller which has @component
//@ComponentScan // moved ApplicationStart to academy.devdojo.springboot2 directory
//@Configuration // Transforms in bean class, filter chain
//
// These 3 annotations can be changed to:
@SpringBootApplication
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
