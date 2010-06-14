@echo off
rem Batch setup

SET service_version=1.0.1-SNAPSHOT

RD /S /Q common\target\classes
RD /S /Q common\target\maven-archiver
DEL /F /S /Q common\target\flightws-common-%service_version%.jar
DEL /F /S /Q common\target\flightws-common-%service_version%-sources.jar
DEL /F /S /Q common\target\flightws-common-%service_version%-tests.jar
DEL /F /S /Q common\target\flightws-common-%service_version%-test-sources.jar

DEL /F /S /Q core\derby.log
RD /S /Q core\target\ab_catalogue_%service_version%_test
RD /S /Q core\target\classes
RD /S /Q core\target\maven-archiver
RD /S /Q core\target\surefire-reports
RD /S /Q core\target\test-classes
DEL /F /S /Q core\target\flightws-core-%service_version%.jar
DEL /F /S /Q core\target\flightws-core-%service_version%-sources.jar
DEL /F /S /Q core\target\flightws-core-%service_version%-tests.jar
DEL /F /S /Q core\target\flightws-core-%service_version%-test-sources.jar

RD /S /Q web\target\flightws-web-%service_version%
RD /S /Q web\target\classes
RD /S /Q web\target\war
RD /S /Q web\target\maven-archiver
DEL /F /S /Q web\target\flightws-web-%service_version%.war
DEL /F /S /Q web\target\flightws-web-%service_version%-sources.jar
DEL /F /S /Q web\target\flightws-web-%service_version%-test-sources.jar

RD /S /Q target

DEL /F /S /Q andromda.log
DEL /F /S /Q andromda-hibernate.log
DEL /F /S /Q andromda-java.log
DEL /F /S /Q andromda-spring.log
DEL /F /S /Q andromda-webservice.log

rem Delete the env variable
SET service_version=