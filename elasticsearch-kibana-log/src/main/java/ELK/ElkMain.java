package ELK;

import ELK.Service.Impl.PizerEsearchServiceImpl;
import ELK.Service.PizerEsearchService;
import ELK.common.ElasticTransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ElkMain {

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.setValidating(false);
        context.load("classpath*:spring.xml");
        context.refresh();
        ElasticTransportClient elasticTransportClient = context.getBean(ElasticTransportClient.class);

        System.out.println("1==="+elasticTransportClient.getClient());
//        elasticTransportClient.toString();

        PizerEsearchServiceImpl pizerEsearchServiceImpl = new PizerEsearchServiceImpl();
        System.out.println(pizerEsearchServiceImpl.getRsearchClientTest());

        System.out.println("2===");
    }
}