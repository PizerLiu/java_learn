package ELK.common;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class ElasticTransportClient {

    public TransportClient client;

    private String elasticSearchHost;

    private int elasticSearchPort;

    public TransportClient getClient() {
        System.out.println("-----2!!!!------"+this.client);
        return this.client;
    }

    @PostConstruct
    public void init() {
        if (elasticSearchHost == null || "".equals(elasticSearchHost)) {
            throw new IllegalArgumentException(" elasticsearch host [" + elasticSearchHost + "] error");
        }
        System.out.println("elasticSearchHost"+elasticSearchHost);
        System.out.println("elasticSearchPort"+elasticSearchPort);
        try {
//            Settings settings = Settings.builder()
//                    .put("cluster.name", "pizer").build();
            client = new PreBuiltTransportClient(Settings.EMPTY)
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(elasticSearchHost), elasticSearchPort));
        } catch (UnknownHostException e) {

        }

    }

    @PreDestroy
    public void destroy() {
        if (client != null) {
            client.close();
        }
    }

    public String getElasticSearchHost() {
        return elasticSearchHost;
    }

    public void setElasticSearchHost(String elasticSearchHost) {
        this.elasticSearchHost = elasticSearchHost;
    }

    public int getElasticSearchPort() {
        return elasticSearchPort;
    }

    public void setElasticSearchPort(int elasticSearchPort) {
        this.elasticSearchPort = elasticSearchPort;
    }

//    @Override
//    public String toString() {
//        System.out.println("Person [elasticSearchHost=" + elasticSearchHost + ", elasticSearchPort=" + elasticSearchPort + "]");
//        return "Person [address=!!!!!!!";
//    }
}