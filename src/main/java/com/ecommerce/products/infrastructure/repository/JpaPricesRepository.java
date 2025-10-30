package com.ecommerce.products.infrastructure.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.ecommerce.products.domain.model.Price;
import com.ecommerce.products.domain.repository.PricesRepository;
import com.ecommerce.products.infrastructure.entity.PricesEntity;

/**
 * Implementación JPA del repositorio para la gestión y consulta de tarifas de un producto.
 * 
 * @author csedano
 * @version 1.0
 */
@Repository
public class JpaPricesRepository implements PricesRepository {

	private final SpringDataPricesRepository springDataPricesRepository;

	public JpaPricesRepository(SpringDataPricesRepository springDataPricesRepository) {
		this.springDataPricesRepository = springDataPricesRepository;
	}

	@Override
	public Optional<Price> getApplicablePriceByDate(LocalDateTime applicationDate, Long productId, Long brandId) {

		Pageable limit = PageRequest.of(0, 1);
		List<PricesEntity> pricesEntity = springDataPricesRepository.findPricesByDate(applicationDate, productId,
				brandId, limit);

		return pricesEntity.stream().findFirst()
				.map(entity -> new Price(entity.getBrandId(), entity.getStartDate(), entity.getEndDate(),
						entity.getRateId(), entity.getProductId(), entity.getPriority(), entity.getPrice(),
						entity.getCurrency()));
	}

}
