package com.example.kafka.config;

//@Configuration
public class KafkaProducerConfig {
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrapServer;
//    @Value("${spring.kafka.producer.key-serializer}")
//    private String keySerializer;
//    @Value("${spring.kafka.producer.value-serializer}")
//    private String valueSerializer;
//
//    @Bean
//    public ProducerFactory<String, Object> producerFactory(){
//        Map<String, Object> producer_properties = new HashMap<>();
//        producer_properties.put(
//                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
//                bootstrapServer
//        );
//        producer_properties.put(
//                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
//                keySerializer
//        );
//        producer_properties.put(
//                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
//                valueSerializer
//        );
//        return new DefaultKafkaProducerFactory<>(producer_properties);
//    }
//    @Bean
//    public KafkaTemplate<String, Object> kafkaTemplate(){
//        return new KafkaTemplate<>(producerFactory());
//    }
}

