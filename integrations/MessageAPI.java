import org.apache.camel.builder.RouteBuilder;


public class MessageAPI extends RouteBuilder {
  @Override
  public void configure() throws Exception {
        from("direct:readdb")
        .setBody(simple("select * from messages order by id desc limit 10"))
        .to("jdbc:camel").marshal().json();
 }
}



