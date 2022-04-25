package zmq.pubsub.publisher;

import zmq.pubsub.Message;
import zmq.pubsub.service.PubSubService;

public class PublisherImp  implements Publisher {
    //Publishes new message to PubSubService
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}
