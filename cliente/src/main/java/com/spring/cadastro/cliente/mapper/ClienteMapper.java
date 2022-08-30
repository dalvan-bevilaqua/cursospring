package com.spring.cadastro.cliente.mapper;

import com.spring.cadastro.cliente.dto.ClienteDto;
import com.spring.cadastro.cliente.entity.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteMapper {
    ClienteDto entidadeParaDto(Cliente cliente);
}
