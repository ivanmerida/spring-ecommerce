package com.medevweb.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//Esto es para excluir cuando aún no tenemos la conexión a la BD
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) // TODO: Posiblemente lo que tenga que eliminar después
public class SpringEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerceApplication.class, args);
	}

}
