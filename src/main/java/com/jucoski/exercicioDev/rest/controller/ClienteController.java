package com.jucoski.exercicioDev.rest.controller;

import com.jucoski.exercicioDev.domain.service.ClienteService;
import com.jucoski.exercicioDev.rest.dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/clientecadastro")
    public String clienteCadastro(@RequestBody ClienteDto clienteDto){
        clienteService.salvarcliente(clienteDto);
        System.out.println(clienteDto.toString());
        return "Cliente cadastrado com sucesso!";
    }

    @GetMapping("/clientecadastro")
    public  ClienteDto buscaCliente(){
        ClienteDto localizarClienteDtoCnpj = clienteService.buscaCliente("cnpj");
        return localizarClienteDtoCnpj;
    }
}
