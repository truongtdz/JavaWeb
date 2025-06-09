package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.response.OrderDetailResponse;
import com.sportshop.sportshop.entity.OrderDetailEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-09T22:46:56+0700",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.42.0.v20250514-1000, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class OrderDetailMapperImpl implements OrderDetailMapper {

    @Override
    public OrderDetailResponse toOrderDetailResponse(OrderDetailEntity order) {
        if ( order == null ) {
            return null;
        }

        OrderDetailResponse.OrderDetailResponseBuilder orderDetailResponse = OrderDetailResponse.builder();

        orderDetailResponse.discount( order.getDiscount() );
        orderDetailResponse.id( order.getId() );
        orderDetailResponse.order( order.getOrder() );
        orderDetailResponse.price( order.getPrice() );
        orderDetailResponse.product( order.getProduct() );
        orderDetailResponse.quantity( order.getQuantity() );
        orderDetailResponse.total( order.getTotal() );

        return orderDetailResponse.build();
    }
}
