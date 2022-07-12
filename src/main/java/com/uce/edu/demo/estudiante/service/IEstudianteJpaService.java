package com.uce.edu.demo.estudiante.service;

import java.util.List;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void insertar(Estudiante estudiante);

	public Estudiante buscar(Integer id);

	public void actualizar(Estudiante estudiante);

	public void eliminar(Integer id);

	public List<Estudiante> buscarPorEdad(String edad);

	public int eliminarPorEdad(String edad);

	public List<Estudiante> buscarPorNombreAsc(String nombre);

	public List<Estudiante> buscarPorEdadDesc(String edad);

	public Estudiante buscarPorCedula(String cedula, String nombre);

	public Estudiante buscarPorCedulaNombre(String cedula, String nombre, String edad);

}
