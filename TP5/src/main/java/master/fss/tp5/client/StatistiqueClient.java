package master.fss.tp5.client;

import master.fss.tp5.model.Resultat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "STATISTIQUE-SERVICE") // Nom du service dans Eureka
public interface StatistiqueClient {

    @GetMapping("/api/stats/derniers-resultats")
    List<Resultat> getDerniersResultats();
}