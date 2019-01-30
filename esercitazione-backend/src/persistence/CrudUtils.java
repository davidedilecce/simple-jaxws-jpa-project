package persistence;

import model.IEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidevincenzodilecce on 23/01/2019.
 */
public class CrudUtils {

    private static CrudUtils shared;

    public static CrudUtils instance() {
        if (shared == null) {
            shared = build();
        }

        return shared;
    }

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;


    private CrudUtils() {
        entityManagerFactory = Persistence.createEntityManagerFactory("testDB");
        entityManager = entityManagerFactory.createEntityManager();
    }

    private static CrudUtils build() {
        return new CrudUtils();
    }

    public Integer save(Object obj) {

        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        entityManager.detach(obj);

        if (obj instanceof IEntity) {
            return ((IEntity) obj).getIdFromEntity();
        } else {
            return null;
        }

    }

    public <T> List<T> find(String query, Class<T> className) {

        List<T> resultList = new ArrayList<T>();

        try {
            TypedQuery<T> q =
                    entityManager.createQuery(query, className);

            resultList = q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;

    }

    public void update(Object obj) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(obj);
            entityManager.getTransaction().commit();
            entityManager.detach(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void delete(Object obj) {
        try {
            entityManager.getTransaction().begin();
            Object managed = entityManager.merge(obj);
            entityManager.remove(managed);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }


    public Object getById(Integer id, Class<?> className) {
        Object o = null;
        try {
            o = entityManager.find(className, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

}
