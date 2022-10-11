package com.jucoski.exercicioDev.rest.controller;

import com.jucoski.exercicioDev.domain.service.ProdutoService;
import com.jucoski.exercicioDev.rest.dto.ClienteDto;
import com.jucoski.exercicioDev.rest.dto.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping("/produtocadastro")
    public String produtoCadastro(@RequestBody ProdutoDto produtoDto){
        System.out.println(produtoDto.toString());
        return "Produto cadastrado com sucesso!";
    }
    @GetMapping("/produtocadastro")
    public ProdutoDto buscaProduto(){
        ProdutoDto localizarProdutoDtoNome = produtoService.buscaProduto("nome");
        return localizarProdutoDtoNome;
    }
}
