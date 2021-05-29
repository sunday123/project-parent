package com.ij34.model;

public enum ClassifyTypeEnum {
    FIRST("大类", 1),
    SECOND("小类", 2),
    SPEC("规格", 3);

    private String name;
    private Integer value;
    private ClassifyTypeEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}