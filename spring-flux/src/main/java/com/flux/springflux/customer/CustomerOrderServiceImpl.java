package com.flux.springflux.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDAO customerOrderDAO;

    @Override
    public Flux<CustomerOrder> findAll() {
        return customerOrderDAO.findAll();
    }

    @Override
    public Mono<CustomerOrder> saveCustomerOrder(CustomerOrder customerOrder) {
        return customerOrderDAO.save(customerOrder);
    }
}
