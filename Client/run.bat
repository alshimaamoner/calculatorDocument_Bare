wsimport -d . -p servicesource -keep http://localhost:9090/ws/calculate?WSDL
pause
javac -d . *.java
pause
java -cp . client.SampleClient
pause