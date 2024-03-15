package com.example.yk_study.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.validation.constraints.*;


@Data
@TableName("user")
@NoArgsConstructor
@AllArgsConstructor
public class userpo {
    @TableId("id")
    @NotNull(message = "id is not null")
    private Long id;
    @NotNull(message = "name is not null")
    private String name;
    @NotNull(message = "age is not null")
    private Integer age;
    @NotNull(message = "email is not null")
    private String email;
}
