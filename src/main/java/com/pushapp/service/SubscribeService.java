package com.pushapp.service;

import com.pushapp.domain.Subscription;

public interface SubscribeService {
    void subscribe(Subscription subscription);
    void send();
}
