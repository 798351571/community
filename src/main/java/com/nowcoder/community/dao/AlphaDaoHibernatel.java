package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoHibernatel implements AlphaDao {
    @Override
    public String select() {
        return "Hibater";
    }
}
