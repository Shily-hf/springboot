package edu.shily.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Shily-zhang
 * @Description 用户
 */
@Data
@ToString
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
