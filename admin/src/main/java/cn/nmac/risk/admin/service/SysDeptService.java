package cn.nmac.risk.admin.service;

import cn.nmac.risk.admin.pojo.SysDept;
import cn.nmac.risk.core.service.CrudService;

import java.util.List;

/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CrudService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
