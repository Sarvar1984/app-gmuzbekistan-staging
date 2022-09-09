package uz.digitalone.appgmuzbekistan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.digitalone.appgmuzbekistan.entity.template.AbcEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class District  extends AbcEntity {


    @Column(nullable = false)
    private Double area;

    @Column(nullable = false)
    private Long population;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
