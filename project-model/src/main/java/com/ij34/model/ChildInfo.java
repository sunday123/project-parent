package com.ij34.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description ChildInfo
 * Date 2021/9/14
 * Created by www.ij34.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChildInfo {
    private String title;
    @JsonProperty("A_BCD")
    private Integer A_BCD;
}

