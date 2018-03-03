package com.example.generator.entity

.generator.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author taotao
 * @since 2018-03-03
 */
@TableName("tb_company")
public class TbCompany extends Model<TbCompany> {

    private static final long serialVersionUID = 1L;

    /**
     * 公司表主键 自增
     */
    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;
    /**
     * 公司名称
     */
    @TableField("c_name")
    private String cName;
    /**
     * 公司类型
     */
    @TableField("c_type")
    private String cType;
    /**
     * 组织机构代码
     */
    @TableField("c_code")
    private String cCode;


    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "TbCompany{" +
        ", cId=" + cId +
        ", cName=" + cName +
        ", cType=" + cType +
        ", cCode=" + cCode +
        "}";
    }
}
