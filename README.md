# Triangle
Triangle
How to run the basic code ?
System requirements :
Java8 
JDK 1.8

Classes required:
Main.Java
Triangle.Java

You can run the main java file and input arguments which are the lengths of the triangle.

Choices Made:
I have created a class triangle and stored it under model directory where i would store POJOs and classes i would use.
I have used "Double" to store the measurements to allow decimal measurements for the sides.
I have over riden the following methods:
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


