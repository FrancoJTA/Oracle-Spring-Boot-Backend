package com.example.oraclebackendtest.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//entidad para mostrar o insinuar que es una tabla
//la id tendra con lo de generated una generacion automatica de IDS
@Entity
@Table(name = "products",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_sku",
                        columnNames = "stock_keeping_unity"
                )
        })
//Lo que hace esta linea de codigo
@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //añadir columna
    @Column(name = "stock_keeping_unity", nullable = false)
    private String sku;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;
    private boolean active;

    @CreationTimestamp
    private LocalDateTime creadaFecha;

    @UpdateTimestamp
    private LocalDateTime updated;



}