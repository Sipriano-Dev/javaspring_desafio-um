package com.sipriano.desafio_um;

import com.sipriano.desafio_um.entities.Order;
import com.sipriano.desafio_um.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioUmApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioUmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ShippingService shippingService = new ShippingService();
		System.out.println(shippingService.shippment(new Order(244, 220.0, 0.0)));
	}
}
