package uz.digitalone.appgmuzbekistan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.digitalone.appgmuzbekistan.entity.template.AbcEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name ="users")
public class User  {
    @Id
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false,unique = true)
    private String email;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Role> roles=new HashSet<>();


    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
