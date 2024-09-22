package com.example.ApiRest.entidades;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "Localidad")
@Audited
public class Localidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;


}
