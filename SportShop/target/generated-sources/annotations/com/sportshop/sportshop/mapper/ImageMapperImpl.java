package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.response.ImageResponse;
import com.sportshop.sportshop.entity.ImageEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-10T08:23:25+0700",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.42.0.v20250514-1000, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class ImageMapperImpl implements ImageMapper {

    @Override
    public ImageResponse toImageResponse(ImageEntity imageEntity) {
        if ( imageEntity == null ) {
            return null;
        }

        ImageResponse.ImageResponseBuilder imageResponse = ImageResponse.builder();

        imageResponse.id( imageEntity.getId() );
        imageResponse.imageLink( imageEntity.getImageLink() );
        imageResponse.product( imageEntity.getProduct() );

        return imageResponse.build();
    }
}
