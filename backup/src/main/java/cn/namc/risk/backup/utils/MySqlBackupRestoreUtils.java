package cn.namc.risk.backup.utils;

import java.io.File;
import java.io.IOException;

public class MySqlBackupRestoreUtils {

    public static boolean backup(String host, String username,
                                 String password, String backupFolderPath,
                                 String filename, String database) throws InterruptedException, IOException {

        File backupFolder = new File(backupFolderPath);
        if (!backupFolder.exists()) {
            backupFolder.mkdirs();
        }
        if (!backupFolderPath.endsWith(File.separator) && !backupFolderPath.endsWith("/")) {
            backupFolderPath = backupFolderPath + File.separator;
        }
        String backipFilePath = backupFolderPath + filename;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("mysqldump --opt").append(" --add-drop-database ").append(" --add-drop-table");
        stringBuffer.append(" -h").append(host).append(" -u").append(username).append(" -p").append(password);
        stringBuffer.append(" --result-file=").append(backipFilePath).append(" --default-character-set=utf-8 ").append(database);
        Process process = Runtime.getRuntime().exec(getCommand(stringBuffer.toString()));
        if (process.waitFor() == 0) {
            System.out.println("数据已经备份到" + backipFilePath + "文件中");
            return true;
        }
        return false;
    }

    public static boolean restore(String restoreFilePath, String host,
                                  String userName, String password, String database) throws Exception {
        File restoreFile = new File(restoreFilePath);
        if (restoreFile.isDirectory()) {
            for (File file : restoreFile.listFiles()) {
                if (file.exists() && file.getPath().endsWith(".sql")) {
                    restoreFilePath = file.getAbsolutePath();
                    break;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mysql -h").append(host).append(" -u").append(userName).append(" -p").append(password);
        stringBuilder.append(" ").append(database).append(" < ").append(restoreFilePath);
        try {
            Process process = Runtime.getRuntime().exec(getCommand(stringBuilder.toString()));
            if (process.waitFor() == 0) {
                System.out.println("数据已从 " + restoreFilePath + " 导入到数据库中");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static String[] getCommand(String command) {
        String os = System.getProperty("os.name");
        String shell = "/bin/bash";
        String c = "-c";
        if(os.toLowerCase().startsWith("win")){
            shell = "cmd";
            c = "/c";
        }
        String[] cmd = { shell, c, command };
        return cmd;
    }

}

