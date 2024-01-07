package com.elasticSearch.elasticsearch.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(indexName = "#{@environment.getProperty('index.log.product')}")
public class UserLogProductEntity {
    @Id
    private String profileId;

    private String contentId;

    @Field(type = FieldType.Text)
    private long watchedDuration;

    @Field(type = FieldType.Text)
    private String contentType;

    @Field(type = FieldType.Text)
    private String Field1;

    @Field(type = FieldType.Text)
    private String Field2;
}
