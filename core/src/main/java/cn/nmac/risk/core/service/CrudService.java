package cn.nmac.risk.core.service;


import cn.nmac.risk.core.page.PageRequest;
import cn.nmac.risk.core.page.PageResult;

import java.util.List;

/**
 * 通用CRUD接口
 */
public interface CrudService<T> {

    /**
     * 保存操作
     * @param record 需要保存的记录
     * @return 保存成功的标记
     */
    int save(T record);

    /**
     * 删除操作
     * @param record 需要删除的记录
     * @return 删除成功的标记
     */
    int delete(T record);

    /**
     * 批量删除操作
     * @param records 需要批量删除的记录List
     * @return 删除成功的标记
     */
    int delete(List<T> records);

    /**
     * 根据ID查询
     * @param id 需要查询的ID
     * @return 此ID对应的记录
     */
    T findById(Long id);

    /**
     * 分页查询
     * @param pageRequest 统一分页查询请求
     * @return 统一分页查询结果
     */
    PageResult findPage(PageRequest pageRequest);
}
