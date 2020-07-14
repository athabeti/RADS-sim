package com.vad.RemoteDirectorySimulator.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vad.RemoteDirectorySimulator.Model.FetchAliasResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponseEntity;

public interface FetchRepository extends JpaRepository<FetchResponseEntity, Long>{

}
