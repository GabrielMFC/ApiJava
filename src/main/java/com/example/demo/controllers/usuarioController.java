package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.usuario;
import com.example.demo.services.usuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {
    
    @Autowired
    private usuarioService usuarioService;

    @GetMapping
    public List<usuario> obterTodos(){
        return usuarioService.obterTodos();
    }
    
    @GetMapping("/{id}")
    public Optional<usuario> obterPorId(@PathVariable long id){
        return usuarioService.obterPorId(id);
    }

    @PostMapping
    public usuario adicionar(@RequestBody usuario usuario){
        return usuarioService.adicionar(usuario);
    }

    @PutMapping("/{id}")
    public usuario atualizar(@PathVariable long id,@RequestBody usuario usuario){
        return usuarioService.atualizar(id,usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        usuarioService.deletar(id);
    }
}
