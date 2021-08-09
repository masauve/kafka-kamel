Pre-requisites:

Camel-K Operator installed
AMQStreams kafka instance deployed
Kamel CLI

This camel-k project includes two integration routes:

1) write a msg from a config map to kafka (KafkaProducer.java)
2) read a msg from Kafka and write to a database (KafkaConsumer.java)

to setup the database and required secret:
oc apply -k manifests/

to deploy the integration routes:
build from source using the provided build scripts (run- ) or deploy using the -integration.yaml crd.
