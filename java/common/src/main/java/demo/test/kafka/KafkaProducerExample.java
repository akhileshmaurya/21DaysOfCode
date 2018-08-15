package demo.test.kafka;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.Properties;
import java.util.Random;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.google.gson.Gson;

public class KafkaProducerExample {

	private static void loadConfig(Properties properties) {
		// https://kafka.apache.org/documentation/#producerapi
		properties.put(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, "ServerIP:9092");
		properties.put(ProducerConfig.RETRIES_CONFIG, "1");
		properties.put(ProducerConfig.BATCH_SIZE_CONFIG, "20971520");
		properties.put(ProducerConfig.LINGER_MS_CONFIG, "33");
		properties.put(ProducerConfig.MAX_REQUEST_SIZE_CONFIG, "2097152");
		properties.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "gzip");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.put("kafka.topic", "kafkaTest");

	}

	public static void main(String[] args) {
		Properties properties = new Properties();
		loadConfig(properties);
		try {
			startProducer(args, properties);
		} catch (Exception e) {
			System.out.println("Got Exception " + e);
		}
	}

	static void startProducer(String[] args, Properties properties) throws Exception {
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		try {
			while (true) {
				Thread.sleep(1000);
				String id = "SampleData-" + getRandom(1, 5);
				ProducerRecord<String, String> record = new ProducerRecord<String, String>(
						properties.getProperty("kafka.topic"), id, getSampleData(id));
				producer.send(record);

			}

		} finally {
			producer.close();

		}

	}

	public static String getSampleData(String id) throws UnsupportedEncodingException {
		String timestamp = new Timestamp(System.currentTimeMillis()).toString();
		KafkaSampleData data = new KafkaSampleData(id, timestamp,
				Base64.getEncoder().encodeToString((id + " Sample data...").getBytes("utf-8")));
		return new Gson().toJson(data);

	}

	private static int getRandom(int start, int end) {
		Random r = new Random();
		return r.ints(start, (end + 1)).findFirst().getAsInt();

	}

}