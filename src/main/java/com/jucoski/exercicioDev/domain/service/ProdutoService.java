package com.jucoski.exercicioDev.domain.service;

import com.jucoski.exercicioDev.domain.model.ProdutoModel;
import com.jucoski.exercicioDev.domain.repository.ProdutoRepository;
import com.jucoski.exercicioDev.rest.dto.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public void salvarProduto(ProdutoDto produtoDto) {

    ProdutoModel produtoModel = new ProdutoModel();

    produtoModel.setNome(produtoDto.getNome());
    produtoModel.setDescricao(produtoDto.getDescricao());
    produtoModel.setMarca(produtoDto.getMarca());
    produtoModel.setPreco(produtoDto.getPreco());

    produtoRepository.salvarProduto(produtoModel);

}

public  ProdutoDto buscaProduto(String nome){
        return produtoRepository.getProduto(nome);
}


}
