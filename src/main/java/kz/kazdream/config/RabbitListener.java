package kz.kazdream.config;

import kz.kazdream.service.rabbit.AutoRabbitMsgReceiver;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitListener {

    public static final String AUTO_TOPIC = "auto_topic";

    public static final String AUTO_QUEUE = "auto_queue";

    public static final String AUTO_ROUTE = "auto_route";

    @Bean
    public Queue queue() {
        return new Queue(AUTO_QUEUE, false);
    }

    @Bean
    public TopicExchange topic() {
        return new TopicExchange(AUTO_TOPIC);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with(AUTO_ROUTE);
    }

    @Bean
    public MessageListenerAdapter adapter(AutoRabbitMsgReceiver receiver) {
        return new MessageListenerAdapter(receiver, "receiveAndSaveMessage");
    }

    @Bean
    public SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
                                                    MessageListenerAdapter adapter) {

        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setConnectionFactory(connectionFactory);
        simpleMessageListenerContainer.setMessageListener(adapter);
        simpleMessageListenerContainer.setQueueNames(AUTO_QUEUE);
        return simpleMessageListenerContainer;
    }

}
