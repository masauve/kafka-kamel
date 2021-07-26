import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;


public class KafkaConsumer extends RouteBuilder {
  @Override
  public void configure() throws Exception {
      from("kafka:{{kafka.topic}}?brokers={{kafka.bootstrap-servers}}")
        .id("consumer")
        .log("!Message: ${body}");
       }
}



