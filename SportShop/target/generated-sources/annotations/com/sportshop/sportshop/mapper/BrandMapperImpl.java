package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.request.BrandRequest;
import com.sportshop.sportshop.dto.response.BrandResponse;
import com.sportshop.sportshop.entity.BrandEntity;
import com.sportshop.sportshop.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-10T08:23:27+0700",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.42.0.v20250514-1000, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class BrandMapperImpl implements BrandMapper {

    @Override
    public BrandResponse toBrandResponse(BrandEntity brandEntity) {
        if ( brandEntity == null ) {
            return null;
        }

        BrandResponse.BrandResponseBuilder brandResponse = BrandResponse.builder();

        brandResponse.id( brandEntity.getId() );
        brandResponse.image( brandEntity.getImage() );
        brandResponse.name( brandEntity.getName() );
        List<ProductEntity> list = brandEntity.getProducts();
        if ( list != null ) {
            brandResponse.products( new ArrayList<ProductEntity>( list ) );
        }

        return brandResponse.build();
    }

    @Override
    public BrandEntity toEntity(BrandRequest brandRequest) {
        if ( brandRequest == null ) {
            return null;
        }

        BrandEntity.BrandEntityBuilder brandEntity = BrandEntity.builder();

        brandEntity.image( brandRequest.getImage() );
        brandEntity.name( brandRequest.getName() );

        return brandEntity.build();
    }
}
