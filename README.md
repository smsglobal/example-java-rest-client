example-java-rest-client
========================

Requirements
----------------
 - Java 1.5 or above
 - Jar files in the dependency folder


Preparation & Compile
--------------------------------
 - Download & Install Maven at http://maven.apache.org/download.cgi
 - Using your commandline console, type the following commands 

~~~
/> mvn dependency:copy-dependencies
/> mvn package
~~~

The jar file will be available under 'dependency' folder and can be included into your project. However please do it at your own risks as this mini project only serves as a sole example.

Run the example Main class
--------------------------------
This class show a few call
~~~
/> java -cp "target/*:target/dependency/*" SMSGlobalRESTClientMain <APIKey> <Secret>
~~~
*Note: Replace \<APIKey\> and \<Secret\> with your own.
