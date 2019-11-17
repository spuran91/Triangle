# Triangle
How to run the basic code ?
System requirements :
Java8 
JDK 1.8

Classes required:
Main.Java
Triangle.Java

You can run the main java file and provide input arguments which are the lengths of the triangle.

Choices Made:
I have created a class triangle and stored it under model directory where i would store POJOs and classes i would use.
I have used "Double" to store the measurements to allow decimal measurements for the sides.
I have over-riden the following methods:
equals , hashcode and toString

I have used Builder pattern to build the objects.
This ensures  better control over construction process.
As we may add more attributes to the triangle class we do not have to define a new constructor each time.

The code checks for the basic property for three sides to form  a triangle,
sum of any two sides should be greater than the third side.
If this is satisfied then it proceeds further to check the type of triangle.
i.e. if all the lengths are equal then it is Equilateral,
if any two lengths are equal then it is an isoceles,
else it is scalene.
If the initial check fails then it should throw an exception.

Unit Tests:
Junit5 is used.
I have written unit tests for the method in Triangletest class.
I have tested scenarios where it throws an exception and one scenario each for various lengths of triangles.



Alternative Approach.

When a UI is used i can think of 2 ways to build the service.
One is having a Server which can handle http requests and responses.
Another is a serverless architecture where i plan to use AWS Cloudstack.
Particularly API Gateway and Lambda.

With HTTP Server:

When we have server which can handle the http requests like netty,jetty,tomcat, in the UI we need to setup the 
fields which accepts lengths of each side of a triangle and sends it as a json(string), making a get call.
In the backend we need a service which can handle the request and respond with a json(string).
I have used SpringFrameworks annotations and the created an endpoint which handle the requests and calls a service class which searlizes the input and returns the type of the triangle.
For serializing i have used Gson. In the given case its just a choic to use the seriazliers, i choose Gson over ObjectMapper its just a choice as i'm comfortable with it.

Serverless way:
I want to discuss breifly how i plan to implement the Serverless part:
I will create an API for handling GET requests in the API Gateway and have an IntegrationType of Lambda functions.
If we have lambda pipleine setup, then we can define handler in the lambda function which would handle the 
inputstreaminput and calculate the type of the result and then respond with  outputstreamhandler.
