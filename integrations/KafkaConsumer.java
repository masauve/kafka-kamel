import org.apache.camel.builder.RouteBuilder;


public class KafkaConsumer extends RouteBuilder {
  @Override
  public void configure() throws Exception {
      from("kafka:{{kafka.topic}}?brokers={{kafka.bootstrap-servers}}")
        .id("consumer")
        .log("!Message: ${body}")
        .setBody(simple("INSERT INTO messages VALUES (null,null,'${body}')"))
        .to("jdbc:camel");
       }
}



