package com.overcod.microservicios.app.cursos.services;

import java.util.List;

import com.overcod.microservicios.app.cursos.models.entity.Curso;
import com.overcod.microservicios.commons.alumnos.models.entity.Alumno;
import com.overcod.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
	
	public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(Long alumnoId);
	
	public Iterable<Alumno> obtenerAlumnosPorCurso(List<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);
}