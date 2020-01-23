package com.appdynamics.dgcops.utils;
import java.util.List;
import com.appdynamics.dgcops.model.Platform;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
public class JSONUtils {
	public static List<Platform> getPlatformObject(String jsonResponse) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		TypeFactory typeFactory = mapper.getTypeFactory();
		CollectionType collectionType = typeFactory.constructCollectionType(
				List.class, Platform.class);
		return mapper.readValue(jsonResponse, collectionType);
	}
}