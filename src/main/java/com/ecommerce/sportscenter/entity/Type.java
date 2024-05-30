package com.ecommerce.sportscenter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *  Описание: Представляет тип продукта (например, одежда, обувь, аксессуары).
 * Связи:
 * @OneToMany(mappedBy = "type"): Это означает, что один Type может быть
 * ассоциирован с множеством Product. Связь "один ко многим" устанавливается с полем type в классе Product.
 */

@Entity
@Table(name = "Type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "type", fetch = FetchType.LAZY)
    private List<Product> products;
}
