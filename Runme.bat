set projectLocation=D:\seleniumworkspace\ProjectFramework1
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\Jars\*
java org.testng.TestNG %projectLocation%\testng.xml
pause