package com.ezadmin.modules.system.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * <p>
 * 角色信息表
 * </p>
 *
 * @author shenyang
 * @since 2025-03-13
 */
@Getter
@Setter
@ToString
@TableName("ez_admin_role")
@Schema(name = "Role", description = "角色信息表")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @Schema(description = "角色ID")
    @TableId(value = "role_id", type = IdType.ASSIGN_ID)
    private Long roleId;

    /**
     * 角色名称
     */
    @Schema(description = "角色名称")
    private String roleName;

    /**
     * 角色权限字符标识
     */
    @Schema(description = "角色权限字符标识")
    private String roleKey;

    /**
     * 排序
     */
    @Schema(description = "排序")
    private Integer roleSort;

    /**
     * 数据范围【1 仅本人数据权限 2 本部门数据权限 3 本部门及以下数据权限 4 自定义数据权限 5 全部数据权限】
     */
    @Schema(description = "数据范围【1 仅本人数据权限 2 本部门数据权限 3 本部门及以下数据权限 4 自定义数据权限 5 全部数据权限】")
    private Integer dataScope;

    /**
     * 角色状态【0 正常 1 停用】
     */
    @Schema(description = "角色状态【0 正常 1 停用】")
    private Integer status;

    /**
     * 创建者
     */
    @Schema(description = "创建者")
    private String createBy;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @Schema(description = "更新者")
    private String updateBy;

    /**
     * 更新时间
     */
    @Schema(description = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    @Schema(description = "备注")
    private String remark;

    /**
     * 是否删除【0 正常 1 已删除】
     */
    @TableLogic
    @Schema(description = "是否删除【0 正常 1 已删除】")
    private Integer isDeleted;
}
