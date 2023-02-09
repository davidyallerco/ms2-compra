package pe.partnerdigital.compra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompraApplication.class, args);
	}

}
/**
 * insertar con POST
 * http://localhost:4444/api/compra
 * poner el user y clave
 *
 * {
 *     "userId": 1,
 *     "inmuebleId": 1,
 *     "titulo": "Casa de verano",
 *     "precio": 7000
 * }
 * OTRA VEZ INSERTAMOS
 * {
 *  *     "userId": 1,
 *  *     "inmuebleId": 2,
 *  *     "titulo": "Casa de invierno",
 *  *     "precio": 6000
 *  * }
 *listar GET
 *
 * http://localhost:4444/api/compra/1
 */