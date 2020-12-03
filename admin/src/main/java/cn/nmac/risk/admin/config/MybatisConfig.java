package cn.nmac.risk.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "cn.nmac.risk.admin.mapper")
public class MybatisConfig {
}
