package com.Voting.Voting.App.Services;

import com.Voting.Voting.App.Repositories.PollRepository;
import com.Voting.Voting.App.models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {
    @Autowired
    private PollRepository pollRepository;
    public Poll createPoll(Poll poll) {
       return pollRepository.save(poll);
    }


}
