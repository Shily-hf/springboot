package edu.shily.springboot.bean;

import lombok.*;

/**
 * @author Shily-zhang
 * @Description 宠物
 */

@Data//Get/Set方法
@NoArgsConstructor//无参构造器
@AllArgsConstructor//满参构造器
@ToString//toString()方法
@EqualsAndHashCode//从写hashcode
public class Pet {
    private String name;


}
