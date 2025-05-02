package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.OrderCreateDTO;
import br.com.primeshoes.api.dtos.OrderResponseDTO;
import br.com.primeshoes.api.entities.Order;

public class OrderMapper {

	public static Order toEntity(OrderCreateDTO orderCreateDTO) {
		Order order = new Order();
		order.setUser(orderCreateDTO.user());
		order.setTotalPrice(orderCreateDTO.totalPrice());
		
		return order;
	}
	
	public static OrderResponseDTO toDTO(Order order) {
		OrderResponseDTO orderResponse = new OrderResponseDTO(order.getId(), order.getUser(), order.getTotalPrice(), order.getStatus(), order.getTrackingCode(), order.getCreated_at(), order.getUpdated_at());
		
		return orderResponse;
	}
}
