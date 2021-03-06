package site.sixteen.springcloud;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface SinkSender {

    String OUTPUT = "input";

    @Output(SinkSender.OUTPUT)
    MessageChannel output();

}