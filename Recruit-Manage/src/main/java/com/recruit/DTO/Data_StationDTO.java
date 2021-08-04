package com.recruit.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Data_StationDTO {


    private String s_name; // 职位描述
    private String address; // 地址
    private String salary ; // 工资
    private String Job_temptation; //职位诱惑
    private String type; // 领域
    private String boss; // 老板
    private String stage; // 当前阶段
    private String scale; // 规模
    private String tag; // 职位公司标签


}
