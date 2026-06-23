package com.mindu.entity;


import jakarta.persistence.*;


@Entity
public class Tarea {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String nombre;

private String descripcion;

private String fecha;

private String estado;



public Long getId() {
return id;
}


public void setId(Long id){
this.id=id;
}


public String getNombre(){
return nombre;
}


public void setNombre(String nombre){
this.nombre=nombre;
}


public String getDescripcion(){
return descripcion;
}


public void setDescripcion(String descripcion){
this.descripcion=descripcion;
}


public String getFecha(){
return fecha;
}


public void setFecha(String fecha){
this.fecha=fecha;
}


public String getEstado(){
return estado;
}


public void setEstado(String estado){
this.estado=estado;
}

}