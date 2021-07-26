import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;


public class KafkaProducer extends RouteBuilder {
  @Override
  public void configure() throws Exception {
      from("timer:java?period=3000")
        .id("generator")
        .setBody(constant("kafka:{{kafka.message}}"))
        .convertBodyTo(String.class)
        .to("kafka:{{kafka.topic}}?brokers={{kafka.bootstrap-servers}}");
 }
}



