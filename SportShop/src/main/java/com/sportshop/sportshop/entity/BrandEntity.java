package com.sportshop.sportshop.entity;

import com.sportshop.sportshop.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "brand_product")
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name_brand")
    String name;

    @Column(name = "image")
    String image;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    StatusEnum status;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private List<ProductEntity> products;
}
