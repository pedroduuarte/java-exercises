package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		Coment c1 = new Coment("Have a nice trip!");
		Coment c2 = new Coment("Wow, that's awesome!"); 
		
		LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		Post p1 = new Post(moment, 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
		
		
	}

}
