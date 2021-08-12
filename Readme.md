Pre-requisites:

Camel-K Operator installed
AMQStreams kafka instance deployed
Kamel CLI

This camel-k project includes 3 integration routes:

1) write a msg from a REST API call to kafka (KafkaProducer.java)
2) read a msg from Kafka and write to a database (KafkaConsumer.java)
3) expose a REST API to interact with the DB directly (MessageAPI.java)

to setup the database and required secret:
oc apply -k manifests/

to deploy the integration routes:
build from source using the provided build scripts (run- ) or deploy using the -integration.yaml crd.

To test the API:

curl --location --request PUT 'http://{HOST}/v1/create' \
--header 'Content-Type: application/octet-stream' \
--data-raw 'salut de REST API!'
