package com.ecommerce.sportscenter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *  Описание: Представляет бренд продукта (например, Nike, Adidas).
 * Связи:
 * @OneToMany(mappedBy = "brand"): Одна марка Brand может быть ассоциирована с множеством Product.
 * Связь "один ко многим" устанавливается с полем brand в классе Product.
 */

@Entity
@Table(name = "Brand")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private List<Product> products;
}
