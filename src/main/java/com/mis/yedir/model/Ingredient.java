package com.mis.yedir.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

    @Id
    private String id;

    private String name;

    private Category category;
}
