package com.nazjara.service;

import com.nazjara.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID id);
}