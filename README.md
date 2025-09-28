# 🚚 KafkaProducer

This project is a **Spring Boot** application designed to act as a **Kafka Producer** for simulating and sending real-time **location updates**. It exposes a **RESTful API** endpoint that, when called, triggers the service to generate a batch of random coordinate messages and publish them to a Kafka topic.

---

## ⚙️ **Tech Stack**

### 🖥️ **Backend**

* **Language**: **Java 17**
* **Frameworks**:
    * **Spring Boot (v3.2.2)**
    * **Spring Web** (for REST API)
    * **Spring Kafka** (for producing messages)
* **Utilities**: **Lombok** (for boilerplate reduction)

### 🌐 **Kafka Configuration**

| Property | Value | Description |
| :--- | :--- | :--- |
| **Bootstrap Servers** | `localhost:9092` | The address of the Kafka broker. |
| **Topic Name** | `location-update-topic` | The name of the topic where location updates are published. |
| **Key Serializer** | `StringSerializer` | Used to serialize the message key. |
| **Value Serializer** | `StringSerializer` | Used to serialize the message value (the location string). |

---

## 🚀 **Functionality**

The core functionality involves generating random coordinate strings like `( X,Y )` and sending them to the Kafka topic.

* **Topic Creation**: The application uses a `@Bean` in `KafkaConfig` to ensure the topic **`location-update-topic`** is created on startup.
* **Message Generation**: The `LocationService` generates **1000** random coordinate pairs upon request.
* **Message Sending**: The `KafkaService` uses **`KafkaTemplate`** to asynchronously publish the messages.

### **API Endpoint**

| Method | Path | Description |
| :--- | :--- | :--- |
| **POST** | `/kafkaProducer/location/update` | Triggers the generation and sending of **1000** random location messages to Kafka. |

* **Server Port**: **`8081`**
