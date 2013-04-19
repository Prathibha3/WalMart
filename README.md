WebService explanation 
Item.java --- The restDemo that was created contains the 'Item java' object that has the setters and getters of the data that requires to be persisted into the database
ItemResource.java –  itemResource.java contains the WebService for implementing Create, update and getting the objects. In reality all the persistence code has to be implemented here, however I have not implemented here for reasons listed below
1.I 
l For some reason Access Database seems to be causing me issues.
l The computer was really slow as full blown version of eclipse takes a lot of memory.
l Also the hibernate that I have implemented requires too many jars and to search for that is too time consuming.
l I also had to install eclipse , firefox and other few installations that was absolutely necessary , which did not install the hibernate framework.  So to work with hibernate makes it more challenging as jars has to be collected/downloaded. 


Hence I have done the next best thing,  just wrote up the code showing that I understand and able to implement in the right environment (Having all the hibernate jars, is required and that is what you see as errors as the libraries are required for compilation..)
hibernate3.jar
antlr-2.7.6
commons-collections-3.1
dom4j-1.6.1
hibernate3
(Oracle database driver required )
javassist-3.4.GA
jta-1.1
slf4j-api-1.5.6
slf4j-simple-1.5.6


Hibernate Code explanation -: the name of the folder is called HibernateImpl

Item.java – contains the getters and setters that can be used for this as well.
InsertDB.java – 
prerequiste for this is to have a database called ORCL and required to created a table called Item.
Basically I have created two methods one to insert and the other to update.
Also I have created a hibernate configuration file called “hibernate.cfg.xml” and “hibernate mapping” file called hibernate.hbm.xml that maps the class file that contains the getters and setters to the database table. Location of hibernate.hbm.xml is included in the hibernate.cfg.xml file. 

Database table creation can be done using the below command.
Create Table Item (Id integer Primary key, Storename VARCHAR(50), location  VARCHAR(50), item Description  VARCHAR(50), price integer, currency VARCHAR(50));


---------------------------------------------------------------------------------------------------------------------------
Test Cases that I would create basically is 

1 ) Make sure the webservices displays the items when you enter intto browser with  URL, Poster in firefox can be used to view the contents.

The URLs would be the below for restDemo. [Different data to be sent and to see if the data returned are as it should be.]
1 )http://67.170.253.251:8080/restdemo/services/items                GET     (WebService)
2 )http://67.170.253.251:8080/restdemo/services/items/0              GET     (WebService)
3 )http://67.170.253.251:8080/restdemo/services/items/create         POST    (requires the xml object to be passed to create the object)  
4 )http://67.170.253.251:8080/restdemo/services/items/update         PUT

5 )Create Webservice Client and test the WS as well.
6 )Make sure that objects are persisted into the database and data is as it should be 
7 )Performance testing
8 )System Testing.
9 I)ntegration testing with the hibernate code.
10 )Test to make sure the data defined in database and class correspond correctly.
11 )Data driven testing would performed to test the limits and boundaries with different values. Also called data scenario testing
12 )Error Testing is when you know that a specific event should trigger a response that is handled by application.
13 )Negative Testing
Elaborate -: Negative testing is that testing which attempts to show that the module does not
do anything that it is not supposed to do. Testing the boundary, you expect the boundaries to return the right
information as that is designed limit within an application.
Negative Testing = (Showing error when not supposed to) + (Not showing error when supposed to) 
(Usually these situations crop up during boundary testing or cause-effect testing.) 
Here if either of the situations in parentheses happens you have a negative test in terms of its result - 
again, not what the test was hoping to find. The application did what it was not supposed to do.
14 )Load Testing.


Snapshots - sent by email.


Sites that I visited are-:
http://www.vogella.com/articles/EGit/article.html  -- getting error when I tried to install the eclipse plugin.
http://blog.bdoughan.com/2010/08/creating-restful-web-service-part-55.html
http://www.ibm.com/developerworks/webservices/library/ws-restful/
http://www.dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-tools-1.html
http://www.buzzle.com/articles/software-testing-methodologies.html

