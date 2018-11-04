package com.xbz.aopdemo.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Alias(value = "user")
public class User {

    private Integer id;
    private String userName = null;
    private String note = null;

}
