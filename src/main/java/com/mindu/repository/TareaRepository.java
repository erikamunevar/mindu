package com.mindu.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.mindu.entity.Tarea;


public interface TareaRepository 
extends JpaRepository<Tarea,Long>{


}