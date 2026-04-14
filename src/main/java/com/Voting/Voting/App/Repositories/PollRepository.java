package com.Voting.Voting.App.Repositories;

import com.Voting.Voting.App.models.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {
}
