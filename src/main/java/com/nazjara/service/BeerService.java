package com.nazjara.service;

import com.nazjara.dto.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeer(UUID id);
}