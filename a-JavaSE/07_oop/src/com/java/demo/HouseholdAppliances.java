package com.java.demo;
// 家电

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseholdAppliances implements Switch {
    private String name;
    // 状态：开或者关。
    private boolean status; // false 默认是关闭。

    @Override
    public void press() {
        // 控制当前设备开和关
        status = !status;
    }
}
