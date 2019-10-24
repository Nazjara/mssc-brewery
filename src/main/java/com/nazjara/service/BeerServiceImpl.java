package com.nazjara.service;

import com.nazjara.dto.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto get(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID())
                .name("Galaxy Cat")
                .style("Pale Ale")
                .upc(10L)
                .build();
    }

    @Override
    public BeerDto create(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .name(beerDto.getName())
                .style(beerDto.getStyle())
                .upc(beerDto.getUpc())
                .build();
    }
}