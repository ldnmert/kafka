Here is a kafka basic example to understand

first run the zookeeper: (CMD) your kafka folder ->  zookeeper-server-start.bat ..\..\config\zookeeper.properties
then run the kafka: (CMD) your kafka folder ->  kafka-server-start.bat ..\..\config\server.properties
and create topics: (CMD) your kafka folder -> kafka-topics.bat --create --topic x-topic --partitions 2 --replication-factor 1 --bootstrap-server localhost:9092, 
kafka-topics.bat --create --topic y-topic --partitions 2 --replication-factor 1 --bootstrap-server localhost:9092

finally run the spring boot apps.
