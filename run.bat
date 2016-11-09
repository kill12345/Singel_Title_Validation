call mvn clean
call mvn compile assembly:single -Dbuild.version=1.3
call java -jar target/Single_Title_Validation-1.3-jar-with-dependencies.jar "http://www.learn2test.net|learn2test.net"