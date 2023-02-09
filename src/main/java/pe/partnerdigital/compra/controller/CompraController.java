package pe.partnerdigital.compra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.partnerdigital.compra.model.Compra;
import pe.partnerdigital.compra.service.CompraService;

@RestController
@RequestMapping("api/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("{id}")
    public ResponseEntity<?> listaPorId(@PathVariable Long id){
        return ResponseEntity.ok(compraService.listarCompraPorId(id));
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Compra compra){
        return new ResponseEntity<>(compraService.guardarCompra(compra), HttpStatus.ACCEPTED.CREATED);
    }
}
