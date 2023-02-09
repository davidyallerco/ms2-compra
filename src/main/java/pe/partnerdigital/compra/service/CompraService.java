package pe.partnerdigital.compra.service;

import pe.partnerdigital.compra.model.Compra;

import java.util.List;

public interface CompraService {


    List<Compra> listarCompraPorId(Long id);

    Compra guardarCompra(Compra compra);


}
