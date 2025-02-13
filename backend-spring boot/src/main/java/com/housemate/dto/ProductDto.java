package com.housemate.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.housemate.model.Category;
import com.housemate.model.Review;
import com.housemate.model.Seller;

@Data
public class ProductDto {

    private Long id;

    private String title;

    private String description;

    private int mrpPrice;

    private int sellingPrice;

    private int discountPercent;

    private int quantity;

    private String color;

    private List<String> images = new ArrayList<>();

    private int numRatings;

    private LocalDateTime createdAt;

    private String Sizes;


}
