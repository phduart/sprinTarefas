package br.com.duarte.springTarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTarefasApplication.class, args);
	}

}
