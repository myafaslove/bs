package com.myafaslove.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author myafaslove
 * @description:
 * @date 2023/2/20 - 15:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
