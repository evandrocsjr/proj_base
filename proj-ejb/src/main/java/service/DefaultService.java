package service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

// NÃO AUTORIZA SALVAR OS REGISTROS DAS INTERAÇÕES ANTERIORES
@Stateless
public abstract class DefaultService {

    // GUARDA A ENTIDADE EM CACHE L1
    @PersistenceContext(unitName = "projBasedb")
    protected EntityManager entityManager;
}
