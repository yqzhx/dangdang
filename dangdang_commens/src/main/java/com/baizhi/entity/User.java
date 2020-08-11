package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
@Data
@Accessors(chain = true)
public class User {
    private String id;
    private String username;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date bir;
}
