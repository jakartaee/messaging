# Eclipse Project for JMS

This repository contains two API versions
1. The jms2.0a directory contains the API as it existed for Oracle Java EE 8
1. The JMS2.1 directory contains the API which was being developed, but was not completed prior to contribution to Eclipse Foundation.

These directories contain the API definition source code for the JMS API. This is used  to generate the official Javadocs.

__However it is not used to directly generate the JMS API jar published in Maven Central.__ Instead, when a new version of the JMS specification is released, the API classes are copied to [Open Message Queue](https://projects.eclipse.org/projects/ee4j.openmq) and the JMS API jar built from there.    

Web-site details are TBD

## Repository structure

This project uses `maven` as build tool, sources follows maven project structure.

Directory or file | Notes
:--- | :---
`jms2.0a` | JMS 2.0a API source (java)
`jms2.1` | JMS 2.1 API source (java)<br>__JMS 2.1 was withdrawn and never released__. <br>This is the latest working version.

## Build from Source

Navigate to the directory and Type `mvn clean package` to produce java api jar file. `mvn javadoc:jar` will produce java doc jar file.  

Note that `doclint` is disabled in jms2.1/pom.xml: For more info see issue [JMS_SPEC-175](https://github.com/eclipse-ee4j/jms-api/issues/175).
