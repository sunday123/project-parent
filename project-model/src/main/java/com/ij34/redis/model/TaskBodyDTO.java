package com.ij34.redis.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class TaskBodyDTO implements Serializable {
    private String name;
    private String body;


}