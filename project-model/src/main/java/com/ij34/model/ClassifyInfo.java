package com.ij34.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassifyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "mysql")
    private Long id;

    /**
     * 类型:1大类、2小类、3具体物品
     */
    private Integer type;

    private Long parentId;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    /**
     * 状态:1启用，0禁止
     */
    private Long state;

    private Long sort;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 图标
     */
    private String image;

    /**
     * 描述
     */
    private String description;

    /**
     * 价格:单位分
     */
    private Long money;

    /**
     * 计件分式：计件、称重
     */
    private String mode;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 规格
     */
    private String specification;


}
