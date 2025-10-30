package com.ecommerce.products.infrastructure.config;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Filtro para loguear todas las peticiones.
 * 
 * @author csedano
 * @version 1.0
 */
@Component
public class LoggingFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		final Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

		long startTime = System.currentTimeMillis();
		logger.info("INICIO - Petición: {} {} desde {}", request.getMethod(), request.getRequestURI(),
				request.getRemoteAddr());

		filterChain.doFilter(request, response);

		long duration = System.currentTimeMillis() - startTime;
		logger.info("FIN - Petición: {} {} con estado {} en {}ms", request.getMethod(), request.getRequestURI(),
				response.getStatus(), duration);
	}

}
