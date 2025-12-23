# Spring Boot RabbitMQ Simple Project

This is a **simple Spring Boot project** that demonstrates how to use **RabbitMQ** to send messages using REST APIs.

The project includes:
- Sending plain text messages to RabbitMQ
- Sending JSON messages (DTO object) to RabbitMQ
- Basic Producer and Controller implementation

---

## Tech Stack
- Java
- Spring Boot
- RabbitMQ
- Spring AMQP
- Lombok

---

## Project Structure
com.rabbitmq.springboot
├── controller
│ ├── MessageController.java
│ └── MessageJsonController.java
├── publisher
│ ├── RabbitMQProducer.java
│ └── RabbitMQJsonProducer.java
├── dto
│ └── User.java
└── SpringbootRabbitmqApplication.java

---

## APIs

### Publish String Message
**Endpoint**

**Description**
Sends a simple string message to RabbitMQ.

---

### Publish JSON Message
**Endpoint**

**Request Body**
```json
{
  "id": 1,
  "firstName": "Darshan",
  "lastName": "SV"
}

---

### Now commit and push it
```bash
git add README.md
git commit -m "Add simple README"
git push
