package cn.nmac.risk.admin.service;

import cn.nmac.risk.admin.pojo.SysDict;
import cn.nmac.risk.core.service.CrudService;

import java.util.List;

public interface SysDictService extends CrudService<SysDict> {

    List<SysDict> findByLabel(String label);
}
