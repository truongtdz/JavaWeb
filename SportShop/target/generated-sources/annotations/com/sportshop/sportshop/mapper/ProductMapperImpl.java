package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.request.ProductRequest;
import com.sportshop.sportshop.dto.response.ProductResponse;
import com.sportshop.sportshop.entity.ImageEntity;
import com.sportshop.sportshop.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-10T08:23:28+0700",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.42.0.v20250514-1000, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponse toProductResponse(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductResponse.ProductResponseBuilder productResponse = ProductResponse.builder();

        productResponse.brand( productEntity.getBrand() );
        productResponse.category( productEntity.getCategory() );
        productResponse.color( productEntity.getColor() );
        productResponse.createDate( productEntity.getCreateDate() );
        productResponse.description( productEntity.getDescription() );
        productResponse.discount( productEntity.getDiscount() );
        productResponse.id( productEntity.getId() );
        List<ImageEntity> list = productEntity.getImages();
        if ( list != null ) {
            productResponse.images( new ArrayList<ImageEntity>( list ) );
        }
        productResponse.name( productEntity.getName() );
        productResponse.price( productEntity.getPrice() );
        productResponse.quantity( productEntity.getQuantity() );
        productResponse.updateDate( productEntity.getUpdateDate() );

        return productResponse.build();
    }

    @Override
    public ProductEntity toProductEntity(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        ProductEntity.ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.color( productRequest.getColor() );
        productEntity.createDate( productRequest.getCreateDate() );
        productEntity.description( productRequest.getDescription() );
        productEntity.discount( productRequest.getDiscount() );
        productEntity.id( productRequest.getId() );
        productEntity.name( productRequest.getName() );
        productEntity.price( productRequest.getPrice() );
        productEntity.quantity( productRequest.getQuantity() );
        productEntity.updateDate( productRequest.getUpdateDate() );

        return productEntity.build();
    }

    @Override
    public void updateProductEntity(ProductEntity productEntity, ProductRequest productRequest) {
        if ( productRequest == null ) {
            return;
        }

        productEntity.setColor( productRequest.getColor() );
        productEntity.setCreateDate( productRequest.getCreateDate() );
        productEntity.setDescription( productRequest.getDescription() );
        productEntity.setDiscount( productRequest.getDiscount() );
        productEntity.setId( productRequest.getId() );
        productEntity.setName( productRequest.getName() );
        productEntity.setPrice( productRequest.getPrice() );
        productEntity.setQuantity( productRequest.getQuantity() );
        productEntity.setUpdateDate( productRequest.getUpdateDate() );
    }
}
