package cn.nmac.risk.admin.service;

import cn.nmac.risk.admin.pojo.SysMenu;
import cn.nmac.risk.core.service.CrudService;

import java.util.List;

/**
 * 菜单管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysMenuService extends CrudService<SysMenu> {

	/**
	 * 查询菜单树,用户ID和用户名为空则查询全部
	 * @param menuType 获取菜单类型，0：获取所有菜单，包含按钮，1：获取所有菜单，不包含按钮
	 * @param userId 
	 * @return
	 */
	List<SysMenu> findTree(String userName, int menuType);

	/**
	 * 根据用户名查找菜单列表
	 * @param userName
	 * @return
	 */
	List<SysMenu> findByUser(String userName);
}
