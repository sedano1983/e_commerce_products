package com.ecommerce.products.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representa la tarifa que aplica a un producto de una cadena entre unas fechas determinadas.
 * 
 * <pre>
 * BRAND_ID: Identificador de la cadena del grupo. 
 * START_DATE, END_DATE: Rango de fechas en el que aplica el precio tarifa indicado.
 * RATE_ID: Identificador de la tarifa de precios aplicable.
 * PRODUCT_ID: Identificador código de producto.
 * PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se
 * aplica la de mayor prioridad (mayor valor numérico).
 * PRICE: Precio final de venta.
 * CURRENCY: Iso de la moneda.
 * </pre>
 * 
 * @author csedano
 * @version 1.0
 */
public record Price(Long brandId, LocalDateTime startDate, LocalDateTime endDate, Long rateId, Long productId,
		Integer priority, BigDecimal price, String currency) {
}
