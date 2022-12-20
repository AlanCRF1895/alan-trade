package alan_stadium.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alan_stadium.model.Jogos;
import alan_stadium.model.Time;

public interface TimesRepository extends JpaRepository<Time, Long> {

	
	
}
