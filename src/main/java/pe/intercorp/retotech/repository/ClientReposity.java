package pe.intercorp.retotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.intercorp.retotech.entity.ClientEntity;
 
@Repository
public interface ClientReposity extends JpaRepository<ClientEntity, Integer>{
	

}
