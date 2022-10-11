package com.jucoski.exercicioDev.domain.repository;

import com.jucoski.exercicioDev.domain.model.ClienteModel;
import com.jucoski.exercicioDev.domain.model.ProdutoModel;
import com.jucoski.exercicioDev.rest.dto.ProdutoDto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {
    public void salvarProduto(ProdutoModel produtoModel){
        System.out.println("Produto inserido com sucesso!");
    }

    public ProdutoDto getProduto(String nome){
        ProdutoDto retornoProduto = new ProdutoDto();
        retornoProduto.setNome("Leite Longa Vida Italac");
        retornoProduto.setDescricao("Leite tipo A 1 litros longa vida");
        retornoProduto.setMarca("Italac");
        retornoProduto.setPreco("R$ 5,29");
        return retornoProduto;
    }

}
