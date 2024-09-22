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
@Table(name = "Autor")
@Audited
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private String biografia;
}
