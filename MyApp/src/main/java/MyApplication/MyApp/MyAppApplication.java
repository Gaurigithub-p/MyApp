package MyApplication.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		System.out.println("*********************************");
        System.out.println("Welcome");
		SpringApplication.run(MyAppApplication.class, args);
		System.out.println("*********************************");
        System.out.println("Bye");
	}

}
