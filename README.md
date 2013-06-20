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

The jar file will be available under 'dependency' folder and can be included into your project. However we do not recommend this as the sole purpose of this mini project is to serve as an example only.

Run
--------------------------------
~~~
/> java -cp "target/*:target/dependency/*" SMSGlobalRESTClientMain
~~~
