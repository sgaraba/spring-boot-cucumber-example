package com.github.jacek99.springbootcucumber.dao;

import com.github.jacek99.springbootcucumber.domain.Restaurant;
import org.springframework.stereotype.Repository;

/**
 * DAO for all restaurants within a tenant
 * @author Jacek Furmankiewicz
 */
@Repository
public class RestuarantDao extends AbstractCassandraDao<Restaurant,String> {

    protected RestuarantDao() {
        super(Restaurant.class);
    }

    @Override
    protected String getEntityId(Restaurant entity) {
        return entity.getId();
    }
}
