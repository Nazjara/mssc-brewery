package com.nazjara.service;

import com.nazjara.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomer(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Customer's name")
                .build();
    }
}