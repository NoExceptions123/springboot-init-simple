package com.lft.springbootinit.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lft.springbootinit.model.dto.interfaceInfo.InterfaceInfoQueryRequest;
import com.lft.springbootinit.model.entity.InterfaceInfo;

/**
 * @author 1213
 * @description 针对表【interface_info(接口信息表)】的数据库操作Service
 * @createDate 2023-03-07 19:16:44
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {


    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);

}
