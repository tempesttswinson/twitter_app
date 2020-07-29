package com.tts.tech_talent_twitter.repository;

import com.tts.tech_talent_twitter.model.Tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

    Tag findByPhrase(String phrase);

}