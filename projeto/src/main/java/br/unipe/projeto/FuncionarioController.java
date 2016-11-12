package br.unipe.projeto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

	@RequestMapping(value="/funcionario", method = RequestMethod.GET)
	public ResponseEntity< List<Funcionario> > listarFuncionarios() {
		
		//dados fake
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		listaFuncionarios.add(new Funcionario(1,"Daniel","End1"));
		listaFuncionarios.add(new Funcionario(2,"Ruan","End2"));
		listaFuncionarios.add(new Funcionario(3,"Atylla","End3"));
		
		return new ResponseEntity< List<Funcionario> >(listaFuncionarios, HttpStatus.OK);
	}

	@RequestMapping(value = "/funcionario/{id}",method = RequestMethod.GET)
	public ResponseEntity<Funcionario> getUser(@PathVariable String id) {
		
		Funcionario funcionario = new Funcionario(1,"Daniel","End1");
		
		return funcionario == null ? 
				new ResponseEntity<Funcionario>(HttpStatus.NOT_FOUND) : 
					new ResponseEntity<Funcionario>(funcionario, HttpStatus.OK);
	}
	
	@RequestMapping(value="/funcionario", method = RequestMethod.POST)
	public ResponseEntity<String> createUser(@RequestBody Funcionario funcionario) {

		try {
			//salvar
			return new ResponseEntity<String>(HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
