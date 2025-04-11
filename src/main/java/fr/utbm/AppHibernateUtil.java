package fr.utbm;

import java.util.List;
import fr.utbm.entity.User;
import org.hibernate.Session;
import fr.utbm.core.util.HibernateUtil;

public class AppHibernateUtil {
    public static void main(String[] args) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            List< User> users = session.createQuery("from User", User.class).list();
            users.forEach(m -> System.out.println(m.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }
}
