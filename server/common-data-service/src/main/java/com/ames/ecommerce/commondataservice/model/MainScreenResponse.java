package com.ames.ecommerce.commondataservice.model;

import com.ames.ecommerce.commondataservice.dto.BrandImagesDTO;
import com.ames.ecommerce.commondataservice.dto.ApparelImagesDTO;
import com.ames.ecommerce.commondataservice.entity.sql.images.CarouselImages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MainScreenResponse implements Serializable {

    private List<BrandImagesDTO> brands;
    private List<ApparelImagesDTO> apparels;
    private List<CarouselImages> carousels;

    public MainScreenResponse(List<BrandImagesDTO> brands,
                              List<ApparelImagesDTO> apparels,
                              List<CarouselImages> carousels) {
        this.brands = brands;
        this.apparels = apparels;
        this.carousels = carousels;
    }
}
