package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.response.OrderResponse;
import com.sportshop.sportshop.entity.OrderDetailEntity;
import com.sportshop.sportshop.entity.OrderEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-09T22:46:56+0700",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.42.0.v20250514-1000, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderResponse toOrderResponse(OrderEntity order) {
        if ( order == null ) {
            return null;
        }

        OrderResponse.OrderResponseBuilder orderResponse = OrderResponse.builder();

        orderResponse.address( order.getAddress() );
        orderResponse.date( order.getDate() );
        orderResponse.id( order.getId() );
        List<OrderDetailEntity> list = order.getItems();
        if ( list != null ) {
            orderResponse.items( new ArrayList<OrderDetailEntity>( list ) );
        }
        orderResponse.phone( order.getPhone() );
        orderResponse.quantity( order.getQuantity() );
        orderResponse.status( order.getStatus() );
        orderResponse.total( order.getTotal() );
        orderResponse.user( order.getUser() );

        return orderResponse.build();
    }
}
