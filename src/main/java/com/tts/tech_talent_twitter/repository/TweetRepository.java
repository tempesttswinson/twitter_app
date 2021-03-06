package com.tts.tech_talent_twitter.repository;

import java.util.List;

import com.tts.tech_talent_twitter.model.Tweet;
import com.tts.tech_talent_twitter.model.TweetDisplay;
import com.tts.tech_talent_twitter.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {
    List<Tweet> findAllByOrderByCreatedAtDesc();

    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);

    List<TweetDisplay> findAllByUserInOrderByCreatedAtDesc(List<User> users);

    List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);

}