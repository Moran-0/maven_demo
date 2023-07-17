package com.moran.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private String userId;
    private String userName;
    private String password;
    private boolean status;
    private String createId;
    private LocalDateTime createTime;
    private String imgUrl;
    private Integer shopId;

}
