package com.xworkz.bucket.dao;

import com.xworkz.bucket.entity.BucketEntity;

public interface BucketDAO {

	boolean save(BucketEntity entity);

	BucketEntity findById(int id);

	void updateBrandAndColorById(String brand, String color, int id);

}
