package zmq.pubsub.publisher;

import zmq.pubsub.Message;
import zmq.pubsub.service.PubSubService;

public interface Publisher {
    //Publishes new message to PubSubService
    void publish(Message message, PubSubService pubSubService);
}
