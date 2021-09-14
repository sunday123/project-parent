package com.ij34.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassifyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "mysql")
    private Long id;
    private String name;
    private List<ChildInfo> valueNum;


}
