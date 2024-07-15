Here is a Kafka basic example to understand


Open the command prompt and navigate to the directory where Kafka is located.

First run the zookeeper
zookeeper-server-start.bat ..\..\config\zookeeper.properties

Then run the kafka
kafka-server-start.bat ..\..\config\server.properties

and create topics: 
kafka-topics.bat --create --topic x-topic --partitions 2 --replication-factor 1 --bootstrap-server localhost:9092, 
kafka-topics.bat --create --topic y-topic --partitions 2 --replication-factor 1 --bootstrap-server localhost:9092

Finally run the spring boot apps.
