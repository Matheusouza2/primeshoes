package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entities.User;
import br.com.primeshoes.api.enuns.OrderStatus;
import java.sql.Date;

public record OrderResponseDTO(
			long id, 
			User user,
			float totalPrice,
			OrderStatus status,
			String trackingCode,
			Date createdAt,
			Date updatedAt
		) {}
