import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.configuration.RunConfiguration
import com.kazurayam.ks.thoughtful.ChromeDriverFactory
import com.kazurayam.ks.thoughtful.ChromeProfileBackupAndRestore

// create a directory to back a Chrome Profile 'Katalon'
Path tmp = Paths.get(RunConfiguration.getProjectDir()).resolve('tmp')
Path backupDir = tmp.resolve('ChromeProfilesBackup')
Files.createDirectories(backupDir)

// backup the Chrome Profile
ChromeProfileBackupAndRestore.backup(backupDir, 'Katalon')

// make sure if successfully backed up
Path cookies = backupDir.resolve('Katalon/Cookies')
assert Files.exists(cookies)