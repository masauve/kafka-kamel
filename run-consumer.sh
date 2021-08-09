kamel run ./integrations/KafkaConsumer.java --configmap=appconfig --config secret:my-datasource --build-property quarkus.datasource.camel.db-kind=mysql -d mvn:io.quarkus:quarkus-jdbc-mysql:2.1.1.Final -t prometheus.enabled=true


#kamel run ./integrations/KafkaConsumer.java --configmap=appconfig  --dev  -p quarkus.datasource.camel.jdbc.url=jdbc:mysql://messagedb:3306/messagedb -p quarkus.datasource.camel.username=messagedb -p quarkus.datasource.camel.password=Demo1234 --build-property quarkus.datasource.camel.db-kind=mysql -d mvn:io.quarkus:quarkus-jdbc-mysql:2.1.1.Final 
