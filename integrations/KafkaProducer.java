import org.apache.camel.builder.RouteBuilder;


public class KafkaProducer extends RouteBuilder {
  @Override
  public void configure() throws Exception {
        from("direct:create")
        .id("generator")
        .convertBodyTo(String.class)
        .to("kafka:{{kafka.topic}}?brokers={{kafka.bootstrap-servers}}");
 }
}



