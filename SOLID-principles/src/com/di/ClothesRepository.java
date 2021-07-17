package com.di;

import java.util.*;

public class ClothesRepository implements ProductRepository {

	@Override
	public List<String> getProductLists()  {
		return Arrays.asList("Shirt","trouser");
	}

}
