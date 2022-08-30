package com.spring.cadastro.cliente.controller;

import com.spring.cadastro.cliente.dto.ClienteDto;
import com.spring.cadastro.cliente.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("v1/cliente")
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping("/{idCliente}")
    public ClienteDto buscarPorId(@PathVariable("idCliente") Integer idCliente) {
        return clienteService.bucarPorId(idCliente);
    }

    @DeleteMapping("/{idCliente}")
    public void deletarPorId(@PathVariable("idCliente") Integer idCliente) {
        clienteService.deletarPorId(idCliente);
    }


}
