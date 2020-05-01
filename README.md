https://stackoverflow.com/q/61465712/8302000

# Spring Boot Actuator Example( Spring Boot 2.2.0.RELEASE + Java 8 )

## Install and Run the Application:

```
./mvnw clean install
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

Open the jconsole:
```
$JAVA_HOME/bin/jconsole
```
While your application is running it will be on the jconsole.

I've used a Thread.sleep(30000L) in the DemoApplication to simplify the example.

Select your "demo-0.0.1-SNAPSHOT.jar" to analyze:

![image1](https://i.stack.imgur.com/beS9T.png)

If this messages shows, select "Insecure Connection":

![image2](https://i.stack.imgur.com/CYlOF.png)

Analysis of the running application:

![image3](https://i.stack.imgur.com/z3KiR.png)

That's it!
