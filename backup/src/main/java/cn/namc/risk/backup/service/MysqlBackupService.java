package cn.namc.risk.backup.service;

/**
 * mysql命令行备份恢复服务
 */
public interface MysqlBackupService {

    boolean backup(String host, String username, String password, String backupFolderPath, String filename, String database) throws Exception;

    boolean restore(String restoreFilePath, String host, String username, String password, String database) throws Exception;
}
