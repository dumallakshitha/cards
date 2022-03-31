package com.dls.cards.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cards_info")
public class Cards {
	
	@Id
	private Long id;
	private String category;
	private Double amount;

}
