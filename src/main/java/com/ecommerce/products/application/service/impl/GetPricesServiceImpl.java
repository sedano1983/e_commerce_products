package com.ecommerce.products.application.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ecommerce.products.application.service.GetPricesService;
import com.ecommerce.products.domain.exception.ResourceNotFoundException;
import com.ecommerce.products.domain.model.Price;
import com.ecommerce.products.domain.repository.PricesRepository;

/**
 * Implementación de servicio para métodos de consulta de tarifas
 * 
 * @author csedano
 * @version 1.0
 */
@Service
public class GetPricesServiceImpl implements GetPricesService {

	private static final Logger logger = LoggerFactory.getLogger(GetPricesServiceImpl.class);

	private final PricesRepository pricesRepository;

	public GetPricesServiceImpl(PricesRepository pricesRepository) {
		this.pricesRepository = pricesRepository;
	}

	@Override
	public Optional<Price> getApplicablePriceByDate(LocalDateTime applicationDate, Long productId, Long brandId) {

		logger.info("Se busca tarifa a aplicar al producto con ID: {} en la fecha: {}", productId, applicationDate);

		Optional<Price> price = pricesRepository.getApplicablePriceByDate(applicationDate, productId, brandId);
		return Optional.of(price.orElseThrow(
				() -> new ResourceNotFoundException("Producto no encontrado o sin tarifa aplicable en esa fecha")));
	}

}
