package alan_stadium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import alan_stadium.client.CepService;
import alan_stadium.model.Apostas;
import alan_stadium.model.Endereco;
import alan_stadium.model.Jogos;
import alan_stadium.repository.JogosRepository;

@RestController
public class GreetingsController {
 
	@Autowired
	private JogosRepository jogosRepository;
	
    @GetMapping("listatodos")
    public ResponseEntity<List<Jogos>> listaApostas(){
    	
    	List<Jogos> jogos = jogosRepository.findAll();
    	
    	return new ResponseEntity<List<Jogos>>(jogos, HttpStatus.OK); //Retorna a lista em Json
    	
    }
    
    @GetMapping("lista-todos")
    public List<Jogos> listaJogos(){
    	
    	List<Jogos> jogos = jogosRepository.findAll();
    	return jogos;
    }
     
}
