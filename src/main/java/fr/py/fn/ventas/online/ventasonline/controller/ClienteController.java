package fr.py.fn.ventas.online.ventasonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.py.fn.ventas.online.ventasonline.entidad.Cliente;
import fr.py.fn.ventas.online.ventasonline.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Cliente> findAll() {
		return this.clienteService.findAll();
	}

	// Single item

	@GetMapping("/{id}")
	public Cliente one(@PathVariable Integer id) {
		
		return this.clienteService.findById(id);
	}

	@PostMapping
	public Cliente newEntity(@RequestBody Cliente cliente) {
		return this.clienteService.save(cliente);
	}
}