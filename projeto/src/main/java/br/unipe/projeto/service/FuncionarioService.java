package br.unipe.projeto.service;

import java.util.List;

import br.unipe.projeto.Funcionario;

public interface FuncionarioService {
	
	Funcionario save(Funcionario func);
	
	Funcionario getById(String id);
	
	List<Funcionario> listarFuncionarios();
	
	void delete(Funcionario func);

}
