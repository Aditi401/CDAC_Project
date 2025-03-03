package com.housemate.controller;

import com.housemate.model.Home;
import com.housemate.response.ApiResponse;
import com.housemate.service.HomeService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping
    public ResponseEntity<ApiResponse> home(){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Welcome to our HouseMate System");
        return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
    }




}
