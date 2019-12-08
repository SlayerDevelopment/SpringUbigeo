package com.slayer.dev.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slayer.dev.daos.DepartamentoDao;
import com.slayer.dev.entities.Departamento;
import com.slayer.dev.services.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;

	@Override
	public List<Departamento> listar() {
		return (List<Departamento>) dao.findAll();
	}

}
