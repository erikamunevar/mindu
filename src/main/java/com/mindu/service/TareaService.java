package com.mindu.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.mindu.entity.Tarea;
import com.mindu.repository.TareaRepository;



@Service
public class TareaService {


private final TareaRepository repository;


public TareaService(TareaRepository repository){

this.repository=repository;

}



public List<Tarea> listar(){

return repository.findAll();

}


public void guardar(Tarea tarea){

repository.save(tarea);

}



public Tarea buscar(Long id){

return repository.findById(id).get();

}


public void eliminar(Long id){

repository.deleteById(id);

}



}