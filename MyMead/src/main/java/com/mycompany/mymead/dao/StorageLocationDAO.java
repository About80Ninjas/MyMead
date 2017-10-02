package com.mycompany.mymead.dao;

import com.mycompany.mymead.model.StorageLocation;

import java.util.List;

public interface StorageLocationDAO {
    StorageLocation addStorageLocation(StorageLocation storageLocation);
    StorageLocation updateStorageLocation(StorageLocation storageLocation);
    void removeStorageLocation(int id);
    List<StorageLocation> getAllStorageLocations();
    StorageLocation getStorageLocationByName(String name);
    StorageLocation getStorageLocationByID(int id);
}
