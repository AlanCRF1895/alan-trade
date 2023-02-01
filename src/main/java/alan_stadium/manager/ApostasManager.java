package alan_stadium.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alan_stadium.model.Apostas;
import alan_stadium.repository.ApostasRepository;

@Service
public class ApostasManager {

	@Autowired
	ApostasRepository apostasRepository;
	
	public List<Apostas> consultarApostasTodas(){
		return apostasRepository.findAll();
	}
	
}
