package com.nazjara.controller;

import com.nazjara.dto.BeerDto;
import com.nazjara.service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BeerDto> get(@PathVariable UUID id) {
        return new ResponseEntity<>(beerService.get(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(BeerDto beerDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + beerService.create(beerDto).getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
}
