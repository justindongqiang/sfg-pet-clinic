package guru.springframework.sfgpetclinic.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet extends BaseEntity{

    //@Column(name = "name")
    private String name;

   // @ManyToOne
    //@JoinColumn(name = "type_id")
    private PetType petType;

   // @ManyToOne
    //@JoinColumn(name = "owner_id")
    private Owner owner;

    //@Column(name = "birth_date")
   // @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
//    private Set<Visit> visits = new HashSet<>();
}
