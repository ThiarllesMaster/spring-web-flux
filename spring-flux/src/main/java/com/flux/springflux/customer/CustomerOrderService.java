package com.flux.springflux.customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerOrderService {

    Flux<CustomerOrder> findAll();

    Mono<CustomerOrder> saveCustomerOrder(CustomerOrder customerOrder);
}
