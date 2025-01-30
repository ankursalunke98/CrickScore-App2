package com.crick.apis.services;

import com.crick.apis.entities.Match;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface MatchService {
    // get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();
    //get cricket world cup point table
    List<List<String>> getPointTable();
}
