package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.request.CreateUserRequest;
import com.sportshop.sportshop.dto.request.UpdateUserRequest;
import com.sportshop.sportshop.dto.response.UserResponse;
import com.sportshop.sportshop.entity.AddressEntity;
import com.sportshop.sportshop.entity.CartEntity;
import com.sportshop.sportshop.entity.UserEntity;
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
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toUserResponse(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        List<AddressEntity> list = userEntity.getAddresses();
        if ( list != null ) {
            userResponse.addresses( new ArrayList<AddressEntity>( list ) );
        }
        userResponse.avatar( userEntity.getAvatar() );
        List<CartEntity> list1 = userEntity.getCarts();
        if ( list1 != null ) {
            userResponse.carts( new ArrayList<CartEntity>( list1 ) );
        }
        userResponse.createDate( userEntity.getCreateDate() );
        userResponse.email( userEntity.getEmail() );
        userResponse.fullName( userEntity.getFullName() );
        userResponse.gender( userEntity.getGender() );
        userResponse.id( userEntity.getId() );
        userResponse.password( userEntity.getPassword() );
        userResponse.phone( userEntity.getPhone() );
        if ( userEntity.getRoles() != null ) {
            userResponse.roles( userEntity.getRoles().name() );
        }
        userResponse.status( userEntity.getStatus() );
        userResponse.updateDate( userEntity.getUpdateDate() );
        userResponse.username( userEntity.getUsername() );

        return userResponse.build();
    }

    @Override
    public UserEntity toUserEntity(CreateUserRequest newUser) {
        if ( newUser == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.avatar( newUser.getAvatar() );
        userEntity.email( newUser.getEmail() );
        userEntity.fullName( newUser.getFullName() );
        userEntity.gender( newUser.getGender() );
        userEntity.password( newUser.getPassword() );
        userEntity.phone( newUser.getPhone() );
        userEntity.username( newUser.getUsername() );

        return userEntity.build();
    }

    @Override
    public void updateUserEntity(UserEntity userEntity, UpdateUserRequest updateUserRequest) {
        if ( updateUserRequest == null ) {
            return;
        }

        userEntity.setAvatar( updateUserRequest.getAvatar() );
        userEntity.setEmail( updateUserRequest.getEmail() );
        userEntity.setFullName( updateUserRequest.getFullName() );
        userEntity.setGender( updateUserRequest.getGender() );
        userEntity.setPassword( updateUserRequest.getPassword() );
        userEntity.setPhone( updateUserRequest.getPhone() );
    }
}
