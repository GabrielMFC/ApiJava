package com.example.demo.controllers;
import com.example.demo.models.produto;
import com.example.demo.services.produtoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class produtoController {

    @Autowired
    private produtoService produtoService;

    @GetMapping
    public List<produto> obterTodos(){
        return produtoService.obterTodos();
    }
    
    @GetMapping("/{id}")
    public Optional<produto> obterPorId(@PathVariable long id){
        return produtoService.obterPorId(id);
    }

    @PostMapping
    public produto adicionar(@RequestBody produto produto){
        return produtoService.adicionar(produto);
    }

    @PutMapping("/{id}")
    public produto atualizar(@PathVariable long id,@RequestBody produto produto){
        return produtoService.atualizar(id,produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        produtoService.deletar(id);
    }
}