package alan_stadium.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import alan_stadium.client.CepService;
import alan_stadium.model.Endereco;

@RestController
public class ControllerCep {
	
    @Autowired
    private CepService cepService;
	
	   @GetMapping("{cep}")
	   public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

	        Endereco endereco = cepService.buscaEnderecoPorCep(cep);
	        return new ResponseEntity<Endereco>(endereco,HttpStatus.OK);
	        //return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
	    }
}
