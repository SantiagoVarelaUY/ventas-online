package fr.py.fn.ventas.online.ventasonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.py.fn.ventas.online.ventasonline.entidad.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
