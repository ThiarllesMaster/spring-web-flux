package com.flux.springflux.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    private CustomerOrderService customerOrderService;

    @GetMapping
    public Flux<CustomerOrder> getCustomer() {
        return customerOrderService.findAll();
    }

    @PostMapping
    public Mono<CustomerOrder> saveCustomer(@RequestBody CustomerOrder customerOrder) {
        return customerOrderService.saveCustomerOrder(customerOrder);
    }
}
