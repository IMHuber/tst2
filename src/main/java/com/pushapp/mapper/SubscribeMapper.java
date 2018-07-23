package com.pushapp.mapper;

import com.pushapp.domain.Subscription;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SubscribeMapper {
    void subscribe(Subscription subscription);
    List<Subscription> getAll();
}
