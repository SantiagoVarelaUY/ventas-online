package fr.py.fn.ventas.online.ventasonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.py.fn.ventas.online.ventasonline.entidad.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
