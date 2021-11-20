package spring.study.swa.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: V
 * @param:
 * @description:
 */
//@Api 注释
@Api("User  用户类")
@Data
public class User {
    @ApiModelProperty("name 名字")
    public String name;
    @ApiModelProperty("password 密码")
    public String password;
}
