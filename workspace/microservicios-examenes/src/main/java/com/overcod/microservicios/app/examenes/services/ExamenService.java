package com.overcod.microservicios.app.examenes.services;

import java.util.List;

import com.overcod.microservicios.commons.examenes.models.entity.Asignatura;
import com.overcod.microservicios.commons.examenes.models.entity.Examen;
import com.overcod.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen>{

	public List<Examen> findByNombre(String term);
	
	public List<Asignatura> findAllAsignaturas();
	
	public Iterable<Long> findExamenesIdConRespuestasByPreguntaIds(Iterable<Long> preguntaIds);
}