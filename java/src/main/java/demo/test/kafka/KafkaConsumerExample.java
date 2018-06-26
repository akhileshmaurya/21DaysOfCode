package demo.test.kafka;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Properties;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;

import com.google.gson.Gson;

public class KafkaConsumerExample {
	private static int maxRecordPoll = 100;

	private static void loadConfig(Properties properties) {
		// https://kafka.apache.org/documentation/#newconsumerconfigs
		properties.put(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, "ServerIp:9092");
		properties.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "gzip");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.put(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG, "2097152");
		properties.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, "500");
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, "my-group");
		properties.put("kafka.topic", "kafkaTest");
	}

	public static void main(String[] args) {
		Properties properties = new Properties();
		loadConfig(properties);
		try {
			startConsumer(args, properties);
		} catch (Exception e) {
			System.out.println("Got Exception " + e);
		}
	}

	static void startConsumer(String[] args, Properties properties) throws Exception {
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

		try {
			consumer.subscribe(Arrays.asList(properties.getProperty("kafka.topic")));

			System.out.println("Subscribed to topic " + properties.getProperty("kafka.topic"));
			while (true) {
				ConsumerRecords<String, String> sampleRecords = consumer.poll(maxRecordPoll);
				for (ConsumerRecord<String, String> sampleRecord : sampleRecords) {
					System.out.printf("partition = %s, offset = %d, key = %s, value = %s\n", sampleRecord.partition(),
							sampleRecord.offset(), sampleRecord.key(),
							decodeSampleData(sampleRecord.value()).toString());
				}
			}
		}

		finally {
			consumer.close();
		}
	}

	public static KafkaSampleData decodeSampleData(String json) throws UnsupportedEncodingException {
		Gson gson = new Gson();
		KafkaSampleData msg = gson.fromJson(json, KafkaSampleData.class);
		// Decoding main data as encoded in producer
		msg.setSampleData(new String(Base64.getDecoder().decode(msg.getSampleData()), "utf-8"));
		return msg;
	}
}