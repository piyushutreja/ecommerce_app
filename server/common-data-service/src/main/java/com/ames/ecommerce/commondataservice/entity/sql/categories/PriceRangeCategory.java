package com.ames.ecommerce.commondataservice.entity.sql.categories;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ames.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class PriceRangeCategory implements Serializable {
    @Id
    private int id;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "priceRangeCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;

    public PriceRangeCategory(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
