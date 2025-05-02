package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.enuns.Role;
import java.time.Instant;

public record UserResponseDTO(
		long id,
		String name,
		String email, 
		Role role,
		Instant created_at,
		Instant updated_at
		) {}
