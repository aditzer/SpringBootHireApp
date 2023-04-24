package com.aditi.joblisting.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
    private String profile;
    private String exp;
    private String desc;
    private String[] techs;
}
