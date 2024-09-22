package com.example.ApiRest.entidades;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "Libro")
@Audited
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private int fecha;

    private String genero;

    private int paginas;

    private String autor;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "Libro-Autor", joinColumns = @JoinColumn(name = "Libro_id"), inverseJoinColumns = @JoinColumn(name = "Autor_id"))
    @Builder.Default
    private List<Autor> autores = new ArrayList<>();

}
