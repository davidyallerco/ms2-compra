package pe.partnerdigital.compra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.partnerdigital.compra.model.Compra;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findAllByUserId(Long id);
}
