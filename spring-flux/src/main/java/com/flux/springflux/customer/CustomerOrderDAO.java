package com.flux.springflux.customer;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CustomerOrderDAO extends R2dbcRepository<CustomerOrder, Long> {
}
