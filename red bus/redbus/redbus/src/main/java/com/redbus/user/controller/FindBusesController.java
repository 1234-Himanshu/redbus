package com.redbus.user.controller;

import com.redbus.user.payload.BusListDto;
import com.redbus.user.service.SearchBusesService;
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class FindBusesController {

    private SearchBusesService searchBusesService;

    public FindBusesController(SearchBusesService searchBusesService) {

        this.searchBusesService = searchBusesService;
    }

    //http://localhost:8080/api/user/searchBuses?departureCity=CityA&arrivalCity=CityB&departureDate=2023-01-01

    @Operation(
            summary = "searches all the buses that are available in database",
            description = "getting all the buses from database using this api"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 OK"
    )
    @GetMapping("/searchBuses")
    public List<BusListDto> searchBuses(
            @RequestParam("departureCity") String departureCity,
            @RequestParam("arrivalCity") String arrivalCity,
             @RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-MM-dd")Date departureDate){
        List<BusListDto> busListDtos = searchBusesService.searchBusBy(departureCity, arrivalCity, departureDate);
        return busListDtos;
    }

}
