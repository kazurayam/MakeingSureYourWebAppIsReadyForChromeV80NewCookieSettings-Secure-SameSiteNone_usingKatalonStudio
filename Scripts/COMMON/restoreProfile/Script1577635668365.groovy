import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.configuration.RunConfiguration
import com.kazurayam.ks.thoughtful.ChromeDriverFactory
import com.kazurayam.ks.thoughtful.ChromeProfileBackupAndRestore

// locate a directory to back a Chrome Profile 'Katalon'
Path tmp = Paths.get(RunConfiguration.getProjectDir()).resolve('tmp')
Path backupDir = tmp.resolve('ChromeProfilesBackup')
assert Files.exists(backupDir)

// restore the Chrome Profile
ChromeProfileBackupAndRestore.restore(backupDir, 'Katalon')
