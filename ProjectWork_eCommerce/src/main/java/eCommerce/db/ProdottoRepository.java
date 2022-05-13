package eCommerce.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eCommerce.model.Prodotto;

@Repository
public interface ProdottoRepository extends CrudRepository<Prodotto, String> {
	
}
