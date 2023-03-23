package com.auction.project.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SocketDTO {
    public String action;
    public Object payload;
}
