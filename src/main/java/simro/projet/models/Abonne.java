package simro.projet.models;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "abonne")
public class Abonne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "text")
    private String nom;

    @Column(nullable = false, columnDefinition = "text")
    private String prenom;

    @Column(nullable = false, columnDefinition = "text")
    private String speculation;

    @Column(length = 3, nullable = false, columnDefinition = "varchar(3) default 'OUI'")
    private String prix = "OUI";

    @Column(length = 3, nullable = false, columnDefinition = "varchar(3) default 'OUI'")
    private String stock = "OUI";

    @Column(nullable = false)
    private String debut;

    @Column(nullable = false)
    private String fin;

    @Column(columnDefinition = "text")
    private String adresse;

    @Column(length = 20, nullable = false)
    private String contact;

    @Column(length = 30, columnDefinition = "varchar(30) default 'Inactif'")
    private String statut = "Inactif";

    @Column(columnDefinition = "text")
    private String description;

    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer region = 0;
}
