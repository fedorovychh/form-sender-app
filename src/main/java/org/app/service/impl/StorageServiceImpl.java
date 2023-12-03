package org.application.service.impl;

import org.application.dao.StorageDao;
import org.application.dao.impl.StorageDaoImpl;
import org.application.service.StorageService;

import java.util.List;

public class StorageServiceImpl implements StorageService {
    private final StorageDao storageDao = new StorageDaoImpl();

    @Override
    public String addNewMarker(String marker) {
        return storageDao.add(marker);
    }

    @Override
    public void removeMarker(String marker) {
        storageDao.remove(marker);
    }

    @Override
    public List<String> getMarkers() {
        return storageDao.getAll();
    }
}
