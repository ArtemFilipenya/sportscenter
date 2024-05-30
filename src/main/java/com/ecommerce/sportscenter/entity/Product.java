package com.ecommerce.sportscenter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  Описание: Описывает конкретный продукт, который продается в интернет-магазине.
 * Атрибуты: включают идентификатор, название, описание, цену, URL изображения.
 * Связи:
 * @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "ProductBrandId"): Это означает, что множество продуктов могут
 * быть связаны с одним брендом. Связь "многие к одному" с таблицей Brand, где ProductBrandId – это внешний ключ.
 * @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "ProductTypeId"): Аналогично, множество продуктов могут быть
 * связаны с одним типом. Связь "многие к одному" с таблицей Type, где ProductTypeId – это внешний ключ.
 */
@Entity
@Table(name = "Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private Long price;

    @Column(name = "PictureUrl")
    private String pictureUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductBrandId", referencedColumnName = "Id")
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductTypeId", referencedColumnName = "Id")
    private Type type;
}
