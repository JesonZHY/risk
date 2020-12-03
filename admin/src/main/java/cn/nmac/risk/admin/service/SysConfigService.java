package cn.nmac.risk.admin.service;

import cn.nmac.risk.admin.pojo.SysConfig;
import cn.nmac.risk.core.service.CrudService;

import java.util.List;

/**
 * 系统配置管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CrudService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
