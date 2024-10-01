package com.example.demo.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.usuario;
import com.example.demo.repositories.usuarioRepositories;

@Service
public class usuarioService {
    @Autowired
    private usuarioRepositories usuarioRepositories;

        public usuario adicionar(usuario usuario){
            usuario.setId(0);
            return usuarioRepositories.save(usuario);
    }

    public List<usuario> obterTodos(){
        return usuarioRepositories.findAll();
    }

    public Optional<usuario> obterPorId(long id){
        Optional<usuario> usuarioLocalizado = usuarioRepositories.findById(id);

        if(usuarioLocalizado.isEmpty()){
            throw new InputMismatchException("Não foi possível encontrar o produto com o id " + id);
        }

        return usuarioLocalizado;
    }

    public usuario atualizar(long id, usuario usuario){
        obterPorId(id);
        usuario.setId(id);

        return usuarioRepositories.save(usuario);
    }

    public void deletar(long id){
        obterPorId(id);
        usuarioRepositories.deleteById(id);
    }
}
