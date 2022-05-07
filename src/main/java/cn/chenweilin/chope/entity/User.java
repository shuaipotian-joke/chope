package cn.chenweilin.chope.entity;

/**
 * user test
 *
 * @author cwl
 * @email 1045501964@qq.com
 * @date 2022/5/7 21:49
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int age;
    private String name;
    private String email;
}
