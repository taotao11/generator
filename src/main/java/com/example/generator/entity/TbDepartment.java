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
@TableName("tb_department")
public class TbDepartment extends Model<TbDepartment> {

    private static final long serialVersionUID = 1L;

    /**
     * 部门id 主键自增
     */
    @TableId(value = "d_id", type = IdType.AUTO)
    private Integer dId;
    /**
     * 部门名称
     */
    @TableField("d_name")
    private String dName;
    /**
     * 做什么
     */
    @TableField("d_do")
    private String dDo;
    /**
     * 外键id
     */
    @TableField("c_id")
    private Integer cId;


    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdDo() {
        return dDo;
    }

    public void setdDo(String dDo) {
        this.dDo = dDo;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Override
    protected Serializable pkVal() {
        return this.dId;
    }

    @Override
    public String toString() {
        return "TbDepartment{" +
        ", dId=" + dId +
        ", dName=" + dName +
        ", dDo=" + dDo +
        ", cId=" + cId +
        "}";
    }
}
