javac -d WEB-INF/classes sr/* 
wsgen -cp WEB-INF/classes -d WEB-INF/classes -wsdl sr.MonService
jar cvf WSSOAP.war WEB-INF/*
asadmin deploy --force WSSOAP.war