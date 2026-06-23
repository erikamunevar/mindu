package com.mindu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import com.mindu.entity.Tarea;
import com.mindu.service.TareaService;



@Controller
public class TareaController {


private final TareaService service;



public TareaController(TareaService service){

this.service=service;

}



@GetMapping("/")
public String inicio(){

return "index";

}



@GetMapping("/tareas")
public String tareas(Model model){

model.addAttribute("lista",service.listar());

model.addAttribute("tarea",new Tarea());

return "tareas";

}



@PostMapping("/guardar")
public String guardar(Tarea tarea){

service.guardar(tarea);

return "redirect:/tareas";

}



@GetMapping("/editar/{id}")
public String editar(@PathVariable Long id, Model model){

model.addAttribute("tarea",service.buscar(id));

return "editar";

}



@PostMapping("/actualizar")
public String actualizar(Tarea tarea){

service.guardar(tarea);

return "redirect:/tareas";

}



@GetMapping("/eliminar/{id}")
public String eliminar(@PathVariable Long id){

service.eliminar(id);

return "redirect:/tareas";

}



}