@echo off
rem Backup the contents of pom.xml in pom.warGenerator.xml
echo F | xcopy pom.xml pom.warGenerator.xml /Y /F
echo F | xcopy common\pom.xml common\pom.warGenerator.xml /Y /F
echo F | xcopy core\pom.xml core\pom.warGenerator.xml /Y /F
echo F | xcopy web\pom.xml web\pom.warGenerator.xml /Y /F

rem Copy poms used for AndroMDA build - code generate.
xcopy pom.codeGenerator.xml pom.xml /Y /F
xcopy common\pom.codeGenerator.xml common\pom.xml /Y /F
xcopy core\pom.codeGenerator.xml core\pom.xml /Y /F
xcopy web\pom.codeGenerator.xml web\pom.xml /Y /F

call mvn -e -f core/pom.xml andromdapp:schema -Dtasks=create -DexecuteScripts=false

rem Restore the poms used for normal build.
xcopy pom.warGenerator.xml pom.xml /Y /F
xcopy common\pom.warGenerator.xml common\pom.xml /Y /F
xcopy core\pom.warGenerator.xml core\pom.xml /Y /F
xcopy web\pom.warGenerator.xml web\pom.xml /Y /F

rem Remove the temporary pom.warGenerator.xml backups
del pom.warGenerator.xml
del common\pom.warGenerator.xml
del core\pom.warGenerator.xml
del web\pom.warGenerator.xml

:end