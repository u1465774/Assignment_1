package com.example.service;

import com.example.domain.Card;
import com.example.domain.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
<<<<<<< HEAD
 * Created by Luke Hardman on 01/12/16.
=======
 * Created by Louie Qin on 01/12/16.
>>>>>>> 9fa015fd5af7fd4ac8079492f2d825755a0a5801
 */
@Service
public class CardService {
    @Autowired
    protected CardRepository cardRepository;

    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    public Card save(Card card) {
        return cardRepository.save(card);
    }

    public void delete(Card card) {
        cardRepository.delete(card);
    }
}
