package br.com.primeshoes.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.dtos.CartCreateDTO;
import br.com.primeshoes.api.dtos.CartResponseDTO;
import br.com.primeshoes.api.dtos.CartUpdateDTO;
import br.com.primeshoes.api.services.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	CartService cartService;
	
	
	@PostMapping
	public ResponseEntity<CartResponseDTO> store(@RequestBody CartCreateDTO cartCreateDTO){
		return new ResponseEntity<>(cartService.store(cartCreateDTO), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<CartResponseDTO>> list(){
		return new ResponseEntity<>(cartService.list(), HttpStatus.OK);
	}
	
	@GetMapping("/show/{id}")
	public ResponseEntity<CartResponseDTO> show(@PathVariable long id){
		return new ResponseEntity<>(cartService.show(id), HttpStatus.OK);
	}
	
	@PatchMapping
	public ResponseEntity<CartResponseDTO> update(@RequestBody CartUpdateDTO cartUpdate){
		return new ResponseEntity<>(cartService.update(cartUpdate), HttpStatus.OK);
	}
	
	@GetMapping("/destroy/{id}")
	public ResponseEntity<String> destroy(@PathVariable long id) {
		cartService.destroy(id);
		
		return new ResponseEntity<>("Carrinho deletado com sucesso", HttpStatus.OK);
	}	
}