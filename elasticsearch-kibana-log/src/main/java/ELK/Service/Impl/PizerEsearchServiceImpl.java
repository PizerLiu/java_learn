package ELK.Service.Impl;

import ELK.Service.PizerEsearchService;
import ELK.common.ElasticTransportClient;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;

public class PizerEsearchServiceImpl implements PizerEsearchService{

    @Autowired
    private ElasticTransportClient elasticTransportClient;

    public String getRsearchClientTest() {
        System.out.println("1````"+elasticTransportClient);
        System.out.println("111````");
        System.out.println(elasticTransportClient.getElasticSearchHost());
        TransportClient esClient = elasticTransportClient.getClient();
        System.out.println("2````");
        String source = "{\"name\":\"will\",\"age\":18}";
        IndexResponse indexResponse = esClient
                .prepareIndex("Lizer", "student", "3").setSource(source).get();
        System.out.println(indexResponse.getId());

        return "success";
    }
}
