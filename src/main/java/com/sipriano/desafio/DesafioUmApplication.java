package com.sipriano.desafio;

import com.sipriano.desafio.entities.Order;
import com.sipriano.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioUmApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioUmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o código: ");
		Integer cod = sc.nextInt();
		System.out.print("Entre com o Preço basico: ");
		Double basic = sc.nextDouble();
		System.out.print("Entre com a Pocentagem de desconto: ");
		Double discount = sc.nextDouble();

		Order order = new Order(cod, basic, discount);
		System.out.println("Pedido Código: " + cod);
		System.out.println("Valor Total: " + orderService.total(order));

		sc.close();
	}
}
