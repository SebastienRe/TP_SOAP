#supprimer tout le contenu de WEB-INF/classes
rm -r WEB-INF/classes/*
javac src/Q3/serveur/*.java -d ./WEB-INF/classes/
wsgen -cp ./WEB-INF/classes -d WEB-INF/classes -wsdl src.Q3.serveur.MonService
jar cvf WSSOAPQ"3".war ./WEB-INF/*
asadmin deploy --force WSSOAPQ"3".war