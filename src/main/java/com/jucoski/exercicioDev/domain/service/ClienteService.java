package com.jucoski.exercicioDev.domain.service;

import com.jucoski.exercicioDev.domain.model.ClienteModel;
import com.jucoski.exercicioDev.domain.repository.ClienteRepository;
import com.jucoski.exercicioDev.rest.dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void  salvarcliente(ClienteDto clienteDto){

        ClienteModel clienteModel = new ClienteModel();

        clienteModel.setNome(clienteDto.getNome());
        clienteModel.setCnpj(clienteDto.getCnpj());
        clienteModel.setLogradouro(clienteDto.getLogradouro());
        clienteModel.setNum(clienteDto.getNum());
        clienteModel.setBairro(clienteDto.getBairro());
        clienteModel.setMunicipio(clienteDto.getMunicipio());
        clienteModel.setEstado(clienteDto.getEstado());
        clienteModel.setCep(clienteDto.getCep());

        clienteRepository.salvarcliente(clienteModel);

    }

    public ClienteDto buscaCliente(String cnpj){
        return  clienteRepository.getCliente(cnpj);
    }
}
