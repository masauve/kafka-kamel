import org.apache.camel.builder.RouteBuilder;


public class KafkaProducer extends RouteBuilder {
  @Override
  public void configure() throws Exception {
        from("direct:create")
        .id("generator")
        .convertBodyTo(String.class)
        .setBody(simple("select * from messages order by id desc limit 10;"));

 }
}



