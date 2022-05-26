package edu.shily.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Shily-zhang
 * @Description 只有在容器中的组件，才会拥有SpringBoot提供的强大的功能
 */

// @Component//加入容器
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "mycar")//对配置文件前缀为mycar的属性进行扫描，进行配置绑定
public class Car {

    private String brand;

    private Double price;

}
