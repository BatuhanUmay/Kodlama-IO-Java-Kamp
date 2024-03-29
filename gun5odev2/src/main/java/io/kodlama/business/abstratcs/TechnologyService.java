package io.kodlama.business.abstratcs;

import java.util.List;

import io.kodlama.business.dto.technology.requests.AddTechnologyRequest;
import io.kodlama.business.dto.technology.requests.UpdateTechnologyRequest;
import io.kodlama.business.dto.technology.responces.GetAllTechnologyResponse;
import io.kodlama.business.dto.technology.responces.GetByIdTechnologyResponse;

public interface TechnologyService {
	List<GetAllTechnologyResponse> getAll();

	GetByIdTechnologyResponse getById(int id);

	void add(AddTechnologyRequest addTechnologyRequest);

	void update(int id, UpdateTechnologyRequest updateTechnologyRequest);

	void delete(int id);
}
