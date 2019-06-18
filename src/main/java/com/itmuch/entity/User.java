package com.itmuch.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/06/17 21:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
