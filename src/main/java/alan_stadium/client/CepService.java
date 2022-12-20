package alan_stadium.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import alan_stadium.model.Endereco;

@FeignClient(url= "https://viacep.com.br/ws/" , value = "viacep")
public interface CepService {

	@GetMapping("{cep}/json")
	Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);
	
}
