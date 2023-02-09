package pe.partnerdigital.compra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.partnerdigital.compra.model.Compra;
import pe.partnerdigital.compra.repository.CompraRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService{

    @Autowired
    private CompraRepository compraRepository;

    @Override
    public List<Compra> listarCompraPorId(Long id){

        return compraRepository.findAllByUserId(id);
    }

    @Override
    public Compra guardarCompra(Compra compra){
        compra.setFechaCompra(LocalDateTime.now());
        return compraRepository.save(compra);
    }


}
