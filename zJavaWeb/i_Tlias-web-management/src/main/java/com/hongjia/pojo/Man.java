package com.hongjia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Man {
    private Integer id;
    private String vessel;
    private String month;
    private String status;
}
