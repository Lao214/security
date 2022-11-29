package com.echoes.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.echoes.system.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.echoes.system.entity.SysUserQueryVo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 劳威锟
 * @since 2022-11-28
 */
public interface SysUserService extends IService<SysUser> {

    void updateStatus(String id, Integer status);

    //用户列表
    IPage<SysUser> selectPage(Page<SysUser> pageParam, SysUserQueryVo sysUserQueryVo);

}
