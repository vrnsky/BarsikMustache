package me.vrnsky.persistence;

import me.vrnsky.persistence.interfaces.HibernateManager;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class HibernateManagerImpl implements HibernateManager {

    public Session getSession() {
        return null;
    }
}
