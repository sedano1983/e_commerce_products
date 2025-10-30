package com.ecommerce.products.domain.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import com.ecommerce.products.domain.model.Price;

/**
 * Interfaz de repositorio para la gestión y consulta de tarifas de un producto.
 * 
 * @author csedano
 * @version 1.0
 */
public interface PricesRepository {

	/**
	 * Obtiene la tarifa aplicada a un producto, en una fecha concreta. Si dos tarifas coinciden en un rango de fechas,
	 * se aplica la de mayor prioridad (mayor valor numérico).
	 * 
	 * @param applicationDate Fecha de aplicación
	 * @param productId       Identificador de producto
	 * @param brandId         Identificador de cadena
	 * @return
	 */
	Optional<Price> getApplicablePriceByDate(LocalDateTime applicationDate, Long productId, Long brandId);

}
