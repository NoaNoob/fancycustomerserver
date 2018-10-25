package com.rest.services;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("customerService")
public class CustomerService {

	static String[] firstnames = { "Anna", "Berta", "Marcus", "Peter", "Olga", "Maria", "Thomas", "Trevor" };
	static String[] lastnames = { "van Damme", "Schmidt", "Cesaré", "Mc Gillen", "Baleone", "Slammyman" };
	static Random random = new Random();

	@GET
	@Path("random")
	@Produces("application/txt")
	public String randomCustomer() {

		String customer = random(firstnames) + " " + random(lastnames); 
		System.out.println("[CustomerService] Customer created: " + customer + " [" + idleAround() + "ms]");
		return customer;
	}
	

	private static String random(String[] array) {

		return array[random.nextInt(array.length - 1)];

	}

	private int idleAround() {
		
		int idle = random.nextInt(130);

		try {
			Thread.sleep(idle);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return idle;
	}
}
