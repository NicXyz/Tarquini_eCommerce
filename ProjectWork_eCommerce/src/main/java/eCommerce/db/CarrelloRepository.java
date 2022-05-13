package eCommerce.db;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eCommerce.model.Carrello;

@Repository
public interface CarrelloRepository extends CrudRepository<Carrello, String> {
	
	//@Query(value="SELECT cod_utente, cod_prodotto, sum(quantita) AS quantita, null AS cod_carrello FROM public.carrello WHERE cod_utente =:codUtente GROUP BY cod_utente, cod_prodotto", nativeQuery=true)
	//List<Carrello> groupByQuantita(@Param("codUtente") Integer codUtente);
	
	Carrello findByCodProdottoAndCodUtente(Integer codProdotto, Integer codUtente);
	
	List<Carrello> findByCodUtente(Integer codUtente);
}
