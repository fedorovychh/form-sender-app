package org.application.dao;

import java.util.List;

public interface StorageDao {
    String add(String marker);

    void remove(String marker);

    List<String> getAll();
}
