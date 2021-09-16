package com.ij34.model;

import lombok.*;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClassifyInfo {

    private Long id;
    private String name;
    private List<ChildInfo> valueNum;


}
