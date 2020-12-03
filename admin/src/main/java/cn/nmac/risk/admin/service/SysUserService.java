package cn.nmac.risk.admin.service;

import cn.nmac.risk.admin.pojo.SysUser;
import cn.nmac.risk.admin.pojo.SysUserRole;
import cn.nmac.risk.core.page.PageRequest;
import cn.nmac.risk.core.service.CrudService;

import java.io.File;
import java.util.List;
import java.util.Set;

public interface SysUserService extends CrudService<SysUser> {


    SysUser findByName(String username);

    /**
     * 查找用户的菜单权限标识集合
     * @param userName
     * @return
     */
    Set<String> findPermissions(String userName);

    /**
     * 查找用户的角色集合
     * @param userName
     * @return
     */
    List<SysUserRole> findUserRoles(Long userId);

    /**
     * 生成用户信息Excel文件
     * @param pageRequest 要导出的分页查询参数
     * @return
     */
    File createUserExcelFile(PageRequest pageRequest);
}
