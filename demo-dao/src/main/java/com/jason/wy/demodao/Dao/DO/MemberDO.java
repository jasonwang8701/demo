package com.jason.wy.demodao.Dao.DO;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-11 10:33
 */

@Data
@ToString
public class MemberDO {


    private int id;

    private String modelCode;

    private Timestamp dateCreate;


    private String brandCode;
}
