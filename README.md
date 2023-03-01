kraft

<img width="1786" alt="Screenshot 2023-03-01 at 2 44 23 AM" src="https://user-images.githubusercontent.com/43849911/221981593-d6406444-e25f-477a-ae76-200cdaee1948.png">

<img width="1127" alt="Screenshot 2023-03-02 at 12 59 29 AM" src="https://user-images.githubusercontent.com/43849911/222244441-7216c180-3623-48e1-9da5-84526b67a44c.png">

```
Producer will take object via rest call.

Kafka streams to analyze and process the real time streams.

Kafka stream will take order object from the topic. If the delivery type from the object is A, it will send that object to another topic called A or else B.
```

<img width="1791" alt="Screenshot 2023-03-02 at 2 09 30 AM" src="https://user-images.githubusercontent.com/43849911/222260033-0dab46bb-9524-4c99-88aa-747fec784d82.png">

<img width="1787" alt="Screenshot 2023-03-02 at 2 10 41 AM" src="https://user-images.githubusercontent.com/43849911/222260115-f117f74a-2eca-41d7-8a44-8b3196a981fa.png">


```
bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

./kafka-console-consumer.sh --bootstrap-server=localhost:9092 --topic=takeaway-service
{"item":"car","quantity":1,"deliveryType":"takeaway"}

./kafka-console-consumer.sh --bootstrap-server=localhost:9092 --topic=user-service
{"item":"car","quantity":1,"deliveryType":"takeaway"}

./kafka-topics.sh --bootstrap-server=localhost:9092 --list
__consumer_offsets
home-service
quickstart-events
takeaway-service
user
```

<img width="1435" alt="Screenshot 2023-03-02 at 3 01 35 AM" src="https://user-images.githubusercontent.com/43849911/222269447-c773f121-06cd-4615-97d1-b1ebdf40763e.png">

