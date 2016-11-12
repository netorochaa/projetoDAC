package br.unipe.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.projeto.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
	
	public Funcionario findByName(String nome);

}
