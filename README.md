groovy-eclipse-plugin-archetype
===============================

Maven archetype creating multiple, Tycho-built, Groovy based eclipse-plugin projects

Use the generated projects 
--------------------------

The generated projects are built using Tycho (http://www.eclipse.org/tycho/) and require at least maven 3.0 (http://maven.apache.org/download.html) to be built via CLI. 
From the root directory of the project, simply run  :

    mvn install

The first run will take quite a while since maven will download all the required dependencies in order to build everything.

In order to use the generated eclipse plugins in Eclipse, you will need :
- Groovy Grails Tool Suite (http://www.springsource.org/downloads/sts-ggts) or Eclipse Juno with PDE with Groovy Eclipse Plugin (http://dist.springsource.org/release/GRECLIPSE/e4.2/)
- m2e 1.1 or more recent. You can install it from http://download.eclipse.org/technology/m2e/releases/
- m2eclipse-tycho 0.6.0 or more recent. You can install it from http://repository.tesla.io:8081/nexus/content/sites/m2e.extras/m2eclipse-tycho/0.7.0/N/0.7.0.201207010121/

Current m2e support in Groovy Eclipse plugin does not automatically add the Groovy nature to the core and test projects.
On each project, you will need to :

- right click on project
- Configure > Convert to Groovy Project