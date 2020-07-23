package br.com.jonathan.monitora;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{

}
