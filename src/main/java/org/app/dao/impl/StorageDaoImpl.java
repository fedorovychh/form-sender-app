package org.application.dao.impl;

import org.application.dao.StorageDao;
import org.application.db.Storage;

import java.util.List;

public class StorageDaoImpl implements StorageDao {

    @Override
    public String add(String marker) {
        Storage.markers.add(marker);
        return marker;
    }

    @Override
    public void remove(String marker) {
        Storage.markers.remove(marker);
    }

    @Override
    public List<String> getAll() {
        return Storage.markers.stream().toList();
    }
}
