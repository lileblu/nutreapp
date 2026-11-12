package com.example.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Usuario;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario,UUID>{

    //Consultas prefabricadas

    //1.Buscar un usuario asociado a un departamente y a un rol especifico 
    List<Usuario> findByDepartamentoAndRol(String departamento, String rol);

    Optional<Usuario> findByCorreo(String correo);

    List <Usuario> findByRolOrderByNombreAsc (String rol);

    Boolean existsByCorreo(String correo);
    
    
}
