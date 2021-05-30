package com.ij34.model;

import java.time.LocalDateTime;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyx
 * @since 2021-05-30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName(autoResultMap = true)
public class AddressInfo {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;

    private LocalDateTime createDate;

    @TableField(typeHandler = FastjsonTypeHandler.class)
    private List<String> codeJson;


}
