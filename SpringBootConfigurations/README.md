# Externalise Properties during runtime

This project is to demonstrate the following
 1. Reading values from configuration file defined inside app jar
 2. Override and read properties in command-line argument ( -- option)
 3. Override and read from external configuration file (-spring.profiles.active=prod)
	(To achieve this create an application-prod.yml file where app jar is available)

There are three properties defined in application.yml file.

    app:
      user:
        name: 
        role: 
        language: 
        

# How to run?

 1. gradle build
 2. cd build/libs
 3. java -jar SpringBootConfigurations-1.0.jar --app.user.name=Anand --spring.profiles.active=prod
