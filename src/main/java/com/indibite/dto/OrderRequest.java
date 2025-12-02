package com.indibite.dto;

import lombok.Data;
import java.util.List;

@Data
public class OrderRequest {
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private List<OrderItemRequest> items;
}
