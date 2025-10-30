package com.ecommerce.products.infrastructure.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.products.infrastructure.entity.PricesEntity;

/**
 * Interfaz JPA de repositorio para la gestión y consulta de tarifas de un producto.
 * 
 * @author csedano
 * @version 1.0
 */
public interface SpringDataPricesRepository extends JpaRepository<PricesEntity, Long> {

	/**
	 * Obtiene la lista de tarifas para un producto, en una fecha concreta, ordenada por prioridad.
	 * 
	 * @param applicationDate Fecha de aplicación
	 * @param productId       Identificador de producto
	 * @param brandId         Identificador de cadena
	 * @param pageable        Objeto para paginar el resultado
	 * @return
	 */
	@Query("""
			SELECT p FROM PricesEntity p
			WHERE p.productId = :productId
			  AND p.brandId = :brandId
			  AND :applicationDate BETWEEN p.startDate AND p.endDate
			ORDER BY p.priority DESC
			""")
	List<PricesEntity> findPricesByDate(@Param("applicationDate") LocalDateTime applicationDate,
			@Param("productId") Long productId, @Param("brandId") Long brandId, Pageable pageable);

}
