package com.psj.domain.query;

import com.psj.domain.User;
import lombok.Data;

@Data
public class UserQuery extends User {
    private Integer age2;  // 年龄的上限
}
