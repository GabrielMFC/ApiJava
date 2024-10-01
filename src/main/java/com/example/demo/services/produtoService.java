package com.example.demo.services;
import com.example.demo.repositories.produtoRepositories;
import com.example.demo.models.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

@Service
public class produtoService {

    @Autowired
    private produtoRepositories produtoRepositories;

        public produto adicionar(produto produto){
            produto.setId(0);
            return produtoRepositories.save(produto);
    }

    public List<produto> obterTodos(){
        return produtoRepositories.findAll();
    }

    public Optional<produto> obterPorId(long id){
        Optional<produto> produtoLocalizado = produtoRepositories.findById(id);

        if(produtoLocalizado.isEmpty()){
            throw new InputMismatchException("Não foi possível encontrar o produto com o id " + id);
        }

        return produtoLocalizado;
    }

    public produto atualizar(long id, produto produto){
        obterPorId(id);
        produto.setId(id);

        return produtoRepositories.save(produto);
    }

    public void deletar(long id){
        obterPorId(id);
        produtoRepositories.deleteById(id);
    }
}
