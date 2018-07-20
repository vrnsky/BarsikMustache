package me.vrnsky.persistence.interfaces;

import org.hibernate.Session;

public interface HibernateManager {

    Session getSession();
}
