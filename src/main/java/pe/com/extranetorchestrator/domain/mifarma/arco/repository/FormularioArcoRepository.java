package pe.com.extranetorchestrator.domain.mifarma.arco.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pe.com.extranetorchestrator.domain.mifarma.arco.model.FormularioArco;

public interface FormularioArcoRepository extends CrudRepository<FormularioArco, Integer> {

	@Query("SELECT coalesce(max(ch.id), 0) FROM FormularioArco ch")
	Long getMaxId();
}
