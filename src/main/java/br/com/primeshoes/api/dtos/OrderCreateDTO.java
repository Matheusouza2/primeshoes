package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entities.User;

public record OrderCreateDTO(
			User user,
			float totalPrice
		) {}
