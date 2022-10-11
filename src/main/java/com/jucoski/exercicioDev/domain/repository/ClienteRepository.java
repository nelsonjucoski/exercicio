package com.jucoski.exercicioDev.domain.repository;

import com.jucoski.exercicioDev.domain.model.ClienteModel;
import com.jucoski.exercicioDev.rest.dto.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository{

    public void salvarcliente(ClienteModel clienteModel){

        System.out.println("Cliente inserido com sucesso!");
    }
    public ClienteDto getCliente(String cnpj){
        ClienteDto retornoCliente = new ClienteDto();
        retornoCliente.setNome("Mini Mercado Silveira");
        retornoCliente.setCnpj("11.119.395/0001-29");
        retornoCliente.setLogradouro("AV. da Saudade");
        retornoCliente.setNum("171");
        retornoCliente.setBairro("Itacoribi");
        retornoCliente.setMunicipio("Florianopolis");
        retornoCliente.setEstado("SC");
        retornoCliente.setCep("88000-100");
        return retornoCliente;
    }

}
