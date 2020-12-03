package cn.namc.risk.backup.constant;

import java.io.File;

public interface BackupConstants {

    String DEFAULT_BACKUP_NAME = "backup";

    String DATE_FORMAT = "yyyy-MM-dd_HHmmss";

    String BACKUP_FOLDER_NAME = "_risk_backup";

    String BACKUP_FOLDER = System.getProperty("user.home") + File.separator + BACKUP_FOLDER_NAME + File.separator;

    String BACKUP_FILE_NAME = "risk.sql";

    String RESTORE_FOLDER = BACKUP_FOLDER;

    String DEFAULT_RESTORE_FILE = BACKUP_FOLDER + DEFAULT_BACKUP_NAME + File.separator + BACKUP_FILE_NAME;
}
