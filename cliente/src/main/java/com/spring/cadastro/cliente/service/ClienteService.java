package com.spring.cadastro.cliente.service;

import com.spring.cadastro.cliente.dto.ClienteDto;
import com.spring.cadastro.cliente.entity.Cliente;
import com.spring.cadastro.cliente.mapper.ClienteMapper;
import com.spring.cadastro.cliente.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;
    private final ClienteMapper mapper;

    public ClienteDto bucarPorId(Integer idCliente) {
        var cliente = buscarPorId(idCliente);
        return mapper.entidadeParaDto(cliente);
    }

    public void deletarPorId(Integer idCliente) {
        var cliente = buscarPorId(idCliente);
        clienteRepository.delete(cliente);
    }

    private Cliente buscarPorId(Integer idCliente) {
        return clienteRepository.findById(idCliente).orElseThrow();
    }
}
