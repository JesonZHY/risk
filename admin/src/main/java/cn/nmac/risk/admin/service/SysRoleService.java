package cn.nmac.risk.admin.service;

import cn.nmac.risk.admin.pojo.SysMenu;
import cn.nmac.risk.admin.pojo.SysRole;
import cn.nmac.risk.admin.pojo.SysRoleMenu;
import cn.nmac.risk.core.service.CrudService;

import java.util.List;

/**
 * 角色管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysRoleService extends CrudService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
