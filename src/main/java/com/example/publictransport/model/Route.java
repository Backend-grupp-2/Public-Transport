package com.example.publictransport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Route {
    private Long id;
    String start;
    String end;
    int time;
}