package com.overcod.microservicios.app.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overcod.microservicios.app.examenes.models.repository.AsignaturaRepository;
import com.overcod.microservicios.app.examenes.models.repository.ExamenRepository;
import com.overcod.microservicios.commons.examenes.models.entity.Asignatura;
import com.overcod.microservicios.commons.examenes.models.entity.Examen;
import com.overcod.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findAllAsignaturas() {
		return (List<Asignatura>) asignaturaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Long> findExamenesIdConRespuestasByPreguntaIds(Iterable<Long> preguntaIds) {	
		return repository.findExamenesIdConRespuestasByPreguntaIds(preguntaIds);
	}

}