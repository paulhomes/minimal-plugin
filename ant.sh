#!/bin/sh
ANT_HOME=/opt/ant/apache-ant-1.10.17
JAVA_HOME=/opt/java/jdk-11.0.23+9
export ANT_HOME JAVA_HOME
${ANT_HOME}/bin/ant $*
