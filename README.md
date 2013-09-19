Getting Started with App42PaaS-Java-CouchDB-Sample Application:
----------------------------------------------------

This application is basically a simple User Input Form that takes input from user and saves it in database.

<b>[Download the source code from git.](https://github.com/shephertz/App42PaaS-Java-CouchDB-Sample/archive/master.zip)</b>

Note: This project is build with java 6.

STS/Eclipse Configuration:
---------------------------

In order to configure this application following steps are to be done:

         1. Import the project in STS/Eclipse.

         2. Right click on the Project and go to properties.

         3. Under java build path, Configure your Tomcat and Java path.
		 
Note: For Eclipse, you have to enable Java Web applications (download the addon).


Project Configuration:
--------------------------

         1. Open Config.properties (located in WebContent folder).

         2. Update the details of your Couch service in it.

                  app42.paas.db.username = <your_database_username>
                  app42.paas.db.port = <your_service_port>
                  app42.paas.db.password = <your_database_password>
                  app42.paas.db.ip = <your_service_ip>
                  app42.paas.db.name = <your_database_name>

         3. Right click on the project and click export.
         
         4. Under web, select WAR file.
         
         5. Enter the destination path and click on the finish button. Your war is ready.
         
         6. Now deploy the binary on App42PaaS.
        
                  $ app42 deploy
                  $ Enter App Name: <your_app_name>
                  $ Would you like to deploy from the current directory? [Yn]: n
                  $ Binary Deployment Path: <your_binary_path>
                  $ This process may take a while, be patient with it.
                  $ Deploying Application... OK
                  $ Please wait it may take few minutes.
                  $ Latest Status....|
                  $ App deployed successfully.




