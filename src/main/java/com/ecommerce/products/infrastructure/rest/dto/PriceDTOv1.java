package com.ecommerce.products.infrastructure.rest.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ecommerce.products.domain.model.Price;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DTO que representa la tarifa que aplica a un producto de una cadena entre unas fechas determinadas.
 * 
 * <pre>
 * BRAND_ID: Identificador de la cadena del grupo. 
 * START_DATE, END_DATE: Rango de fechas en el que aplica el precio tarifa indicado.
 * RATE_ID: Identificador de la tarifa de precios aplicable.
 * PRODUCT_ID: Identificador código de producto.
 * PRICE: Precio final de venta.
 * </pre>
 * 
 * @author csedano
 * @version 1.0
 */
public record PriceDTOv1(
		@Schema(name = "brandId", example = "1", description = "Identificador de la cadena del grupo", requiredMode = Schema.RequiredMode.NOT_REQUIRED) 
			Long brandId,
		@Schema(name = "startDate", example = "2025-10-23T10:00Z", description = "Fecha de inicio del rango en el que aplica el precio tarifa indicado", requiredMode = Schema.RequiredMode.NOT_REQUIRED) 
			LocalDateTime startDate,
		@Schema(name = "endDate", description = "Fecha de fin del rango en el que aplica el precio tarifa indicado", requiredMode = Schema.RequiredMode.NOT_REQUIRED) 
			LocalDateTime endDate,
		@Schema(name = "rateId", example = "1", description = "Identificador de la tarifa de precios aplicable", requiredMode = Schema.RequiredMode.NOT_REQUIRED) 
			Long rateId,
		@Schema(name = "productId", example = "1", description = "Identificador código de producto", requiredMode = Schema.RequiredMode.NOT_REQUIRED) 
			Long productId,
		@Schema(description = "Precio final de venta", example = "39.99") 
			BigDecimal price) {

	public PriceDTOv1(Price price) {
		this(price.brandId(), price.startDate(), price.endDate(), price.rateId(), price.productId(), price.price());
	}

}
