package com.Voting.Voting.App.Controllers;

import com.Voting.Voting.App.Services.PollService;
import com.Voting.Voting.App.models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {
    @Autowired
    private PollService pollService;
    @PostMapping
    public Poll addPoll(@RequestBody Poll poll) {
        return pollService.createPoll(poll);
    }
}
