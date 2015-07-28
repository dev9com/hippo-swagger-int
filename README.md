# hippo-swagger-int
Project demonstrates a method for integrating Hippo CMS with Swagger annotations for RESTful resources.

Document Location
-----------------

When running locally, the swagger documentation can be found at the following locations:

 - Swagger api docs: http://localhost:8080/site/rest/api-docs
 - Swagger ui: http://localhost:8080/site/swagger

How to Add to a Project
-----------------------

1. Add the swagger dependency to your site:
```<dependency>
<groupId>com.wordnik</groupId>
<artifactId>swagger-jaxrs_2.10</artifactId>
<version>1.3.12</version>
</dependency>
```

2. Make modifications to spring configuration files
 - TODO: details

3. Add annotations to resources and beans
 - TODO: examples

4. Add swagger UI
 - TODO: discuss hippo-compatible method

Basic Hippo Development Practices
=================================

Running locally
---------------

This project uses the Maven Cargo plugin to run Essentials, the CMS and site locally in Tomcat.
From the project root folder, execute:

  mvn clean verify
  mvn -P cargo.run

Access the Hippo Essentials at http://localhost:8080/essentials.
After your project is set up, access the CMS at http://localhost:8080/cms and the site at http://localhost:8080/site.
Logs are located in target/tomcat7x/logs

Building distribution
---------------------

To build a Tomcat distribution tarball containing only deployable artifacts:

  mvn clean verify
  mvn -P dist

See also src/main/assembly/distribution.xml if you need to customize the distribution.

Using JRebel
------------

Set the environment variable REBEL_HOME to the directory containing jrebel.jar.

Build with:

  mvn clean verify -Djrebel

Start with:

  mvn -P cargo.run -Djrebel

Best Practice for development
-----------------------------

Use the option -Drepo.path=/some/path/to/repository during start up. This will avoid
your repository to be cleared when you do a mvn clean.

For example start your project with:

  mvn -P cargo.run -Drepo.path=/home/usr/tmp/repo

or with jrebel:

  mvn -P cargo.run -Drepo.path=/home/usr/tmp/repo -Djrebel

Hot deploy
----------

To hot deploy, redeploy or undeploy the CMS or site:

  cd cms (or site)
  mvn cargo:redeploy (or cargo:undeploy, or cargo:deploy)

Automatic Export
----------------

Automatic export of repository changes to the filesystem is turned on by default. To control this behavior, log into
http://localhost:8080/cms/console and press the "Enable/Disable Auto Export" button at the top right. To set this
as the default for your project edit the file
./bootstrap/configuration/src/main/resources/configuration/modules/autoexport-module.xml

Monitoring with JMX Console
---------------------------
You may run the following command:

  jconsole

Now open the local process org.apache.catalina.startup.Bootstrap start
