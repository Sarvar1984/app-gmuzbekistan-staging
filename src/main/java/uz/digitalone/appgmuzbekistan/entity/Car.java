package uz.digitalone.appgmuzbekistan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.digitalone.appgmuzbekistan.entity.template.AbcEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car extends AbcEntity {

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private LocalDate year;

    @Column(nullable = false)
    private Double price;

    @ManyToOne

    private GM company;
}
