package pc;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by dawid on 08.11.16.
 */
@SpringBootApplication
public class Application {
    PC pc = new PC();

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
