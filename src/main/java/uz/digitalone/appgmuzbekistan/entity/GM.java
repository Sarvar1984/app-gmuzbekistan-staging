package uz.digitalone.appgmuzbekistan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.digitalone.appgmuzbekistan.entity.template.AbcEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GM extends AbcEntity {
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private User director;

    @ManyToOne
    @JoinColumn(name = "parient_id")
    private GM parent;
}
