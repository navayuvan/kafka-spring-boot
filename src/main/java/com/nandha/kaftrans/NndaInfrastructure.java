package com.nandha.kaftrans;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.springframework.kafka.config.KafkaStreamsInfrastructureCustomizer;

public class NndaInfrastructure implements KafkaStreamsInfrastructureCustomizer {

    @Override
    public void configureBuilder(StreamsBuilder builder) {

        System.out.println("\n--------------------------------[ nandha ]---------------------------------\n");
        System.out.println(builder);
        System.out.println("\n--------------------------------[ nandha ]---------------------------------\n");
        
    }

    @Override
    public void configureTopology(Topology topology) {

        System.out.println("\n--------------------------------[ nandha ]---------------------------------\n");
        System.out.println(topology);
        System.out.println("\n--------------------------------[ nandha ]---------------------------------\n");
        
    }
}
