package com.dls.cards.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cards")
public class CardsController {
	
	
	@GetMapping
	public List<String> getCardDetails(){
		
		return List.of("card1","card2","card3");
	}

}
