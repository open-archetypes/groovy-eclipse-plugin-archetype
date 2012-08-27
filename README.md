groovy-eclipse-plugin-archetype
===============================

Maven archetype creating multiple, Tycho-built, Groovy based eclipse-plugin projects with a nested structure :

     __artifactId__    : parent pom project
     |
     |---__artifactId__.core   : eclipse-plugin 
     |
     |---__artifactId__.feature: eclipse-feature 
     |
     |---__artifactId__.test   : eclipse-test-plugin (Fragment project)
     |
     |---__artifactId__.site : eclipse-update-site

The generated plugin is based on the Hello World template from the PDE Wizard, rewritten in Groovy :

    [...] creates a simple action set that adds Sample Menu to the menu bar and a button to the tool bar. 
    Both the menu item in the new menu and the button invoke the same Sample Action. 
    Its role is to open a simple message dialog with a message of your choice.


Pre-Requisites :
-------------------

* JDK 1.6 or later
* maven 3.0 or later
* Eclipse Juno (4.2) with PDE and the Groovy Eclipse Plugin, or Groovy Grails Tool Suite (http://www.springsource.org/downloads/sts-ggts)
* m2e 1.1 or later
* m2eclipse-tycho 0.6 or later

How to use
-------------------

In Eclipse, first add the Open Archetypes catalog :

* On the Archetypes Preferences page (Window > Preferences > Maven > Archetypes), click on the "Add Remote Catalog..." button

    - Catalog file : http://open-archetypes.github.com/maven-repo/snapshots/
    - Description : Open Archetypes (Snapshots)

* Click OK to close the dialog
* Click OK to close the preferences

Now you can create a new project, using the Maven wizard :    

* Create a new Maven project
* Click Next to land on the Archetype page
* Select the `Open Archetypes (Snapshots)` catalog
* Check the "Include Snapshots" button
* Select `groovy-eclipse-plugin-archetype` and click Next
* Enter the Group Id, Artifact Id and Version informations. Eclipse requires the version to follow a Major.Minor.Micro pattern, so you should use 1.0.0-SNAPSHOT instead of 1.0-SNAPSHOT
* You can change the required properties if needed :

    - tycho_version : the tycho version that will be used to build the project in command line. Defaults to 0.15.0
    - eclipse_platform : the Eclipse platform, will drive what eclipse update site will be used to resolve the Eclipse dependencies.
    Supported values are : `helios`, `indigo`, `juno`. Defaults to `juno` .
* Hit Finish
* Wait for awesomeness

Current m2e support in Groovy Eclipse plugin does not automatically add the Groovy nature to the core and test projects.
On these projects, you will need to :

- right click on project
- Configure > Convert to Groovy Project

Once the projects are created, you can start testing Eclipse hosted mode, run JUnit Plug-in tests ...

You can then build your projects in command line, in a terminal, by issuing :

    mvn clean install

An zipped update site will be created as `<project.parent>/<project.site>/target/<project.site>-<project.version>-site.zip`.
