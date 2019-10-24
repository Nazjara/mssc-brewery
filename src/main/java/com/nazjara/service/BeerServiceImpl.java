package com.nazjara.service;

import com.nazjara.dto.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeer(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID())
                .name("Galaxy Cat")
                .style("Pale Ale")
                .build();
    }
}
