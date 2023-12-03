package org.application.service;

import java.util.List;

public interface StorageService {
    String addNewMarker(String marker);

    void removeMarker(String marker);

    List<String> getMarkers();
}
