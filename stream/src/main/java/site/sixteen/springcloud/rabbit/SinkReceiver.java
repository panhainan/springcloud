package site.sixteen.springcloud.rabbit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * SinkReceiver
 *
 * @author panhainan
 * @description
 * @date 2019/3/13 18:05
 */
@Slf4j
@EnableBinding(Sink.class)
public class SinkReceiver {

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        log.info("Received:{}",payload);
    }
}
