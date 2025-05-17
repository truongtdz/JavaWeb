package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.response.CategoryResponse;
import com.sportshop.sportshop.entity.CategoryEntity;
import com.sportshop.sportshop.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-17T15:49:59+0700",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResponse toCategoryResponse(CategoryEntity category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse.CategoryResponseBuilder categoryResponse = CategoryResponse.builder();

        categoryResponse.id( category.getId() );
        categoryResponse.name( category.getName() );
        List<ProductEntity> list = category.getProducts();
        if ( list != null ) {
            categoryResponse.products( new ArrayList<ProductEntity>( list ) );
        }

        return categoryResponse.build();
    }
}
